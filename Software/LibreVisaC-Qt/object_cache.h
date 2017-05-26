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

#ifndef librevisa_object_cache_h_
#define librevisa_object_cache_h_ 1

#include "exception.h"

#include <map>

namespace librevisa {

class object;
class resource;
class resource_manager;
class session;
class findlist;

class object_cache
{
public:
        ~object_cache() throw();

        object *get_object(ViObject);
        session *get_session(ViSession);
        findlist *get_findlist(ViFindList);

        void remove(ViObject);

        ViSession add(resource *);
        ViFindList create_findlist();

private:
        typedef std::map<ViSession, session *> smap;
        smap sessions;

        typedef std::map<ViFindList, findlist *> fmap;
        fmap findlists;

        ViObject find_id();
};

extern object_cache objects;

}

#endif
