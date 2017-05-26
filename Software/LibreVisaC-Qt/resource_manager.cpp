
/* 
 * Copyright (C) 2012 Simon Richter
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

#ifdef HAVE_CONFIG_H
#include <config.h>
#endif

#include "resource_manager.h"
#include "resource_creator.h"

#include "resource.h"
#include "object_cache.h"
#include "findlist.h"

namespace librevisa {

ViStatus resource_manager::Open(ViRsrc rsrcName, ViAccessMode /*accessMode*/, ViUInt32 /*timeout*/, ViSession *vi)
{
        try
        {
                resource *res = create(rsrcName);
                *vi = objects.add(res);
                return VI_SUCCESS;
        }
        catch(std::bad_alloc &)
        {
                return VI_ERROR_ALLOC;
        }
        catch(exception &e)
        {
                return e.code;
        }
}

ViStatus resource_manager::Close()
{
        // Closing the last instance of the resource manager has no effect.
        return VI_SUCCESS;
}

ViStatus resource_manager::GetAttribute(ViAttr attr, void *attrState)
{
        switch(attr)
        {
        case VI_ATTR_RSRC_NAME:
                *reinterpret_cast<ViRsrc>(attrState) = '\0';
                return VI_SUCCESS;

        case VI_ATTR_RM_SESSION:
                *reinterpret_cast<ViSession *>(attrState) = VI_NULL;
                return VI_SUCCESS;

        default:
                return resource::GetAttribute(attr, attrState);
        }
}

ViStatus resource_manager::SetAttribute(ViAttr attr, ViAttrState attrState)
{
        return resource::SetAttribute(attr, attrState);
}

ViStatus resource_manager::FindRsrc(
        ViString /*expr*/,
        ViPFindList findList,
        ViPUInt32 retCount,
        ViRsrc instrDesc)
{
        *findList = objects.create_findlist();
        findlist *list = objects.get_findlist(*findList);

        for(resource_creator const *const *i = creators; i != creators + num_creators; ++i)
        {
                if(!*i)
                        continue;
                (*i)->find(*list);
        }

        *retCount = list->size();

        return list->FindNext(instrDesc);
}


ViStatus resource_manager::ParseRsrc(
        ViRsrc,//rsrc,
        ViUInt16 *,//intfType,
        ViUInt16 *,//intfNum,
        ViString *,//rsrcClass,
        ViString *,//unaliasedExpandedRsrcName,
        ViString *)//aliasIfExists)
{
        return VI_ERROR_NSUP_OPER;
}

void resource_manager::register_creator(resource_creator const &cre)
{
        for(resource_creator const **i = creators; i != creators + num_creators; ++i)
        {
                if(*i)
                        continue;
                *i = &cre;
                break;
        }
}

resource *resource_manager::create(ViRsrc rsrcName)
{
        std::string const name = rsrcName;

        std::vector<std::string> components;
        std::string::const_iterator component_begin = name.begin();
        for(std::string::const_iterator i = name.begin(); i < name.end(); ++i)
        {
                if(*i != ':')
                        continue;
                std::string::const_iterator next = i + 1;
                if(next == name.end())
                        continue;
                if(*next != ':')
                        continue;
                components.push_back(std::string(component_begin, i));
                component_begin = next + 1;
        }
        components.push_back(std::string(component_begin, name.end()));

        for(resource_creator const *const *i = creators; i != creators + num_creators; ++i)
        {
                if(!*i)
                        continue;
                resource *rsrc = (*i)->create(components);
                if(rsrc)
                        return rsrc;
        }
        throw exception(VI_ERROR_RSRC_NFOUND);
}

resource_manager default_resource_manager;

}
