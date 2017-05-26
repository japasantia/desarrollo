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

#include "visa.h"

#include "object_cache.h"
#include "object.h"

using namespace librevisa;

/** Close a handle to a VISA session, find list or event.
 * Closes the handle vi and frees the underlying object. Connections to a
 * resource are terminated only when the last session is closed.
 * @param[in]   vi              Handle to be closed
 * @return      status code
 * @retval      VI_SUCCESS      Handle successfully closed
 */
ViStatus _VI_FUNC viClose(ViObject vi)
{
        try
        {
                ViStatus ret = objects.get_object(vi)->Close();

                if(ret == VI_SUCCESS)
                        objects.remove(vi);

                return ret;
        }
        catch(exception &e)
        {
                return e.code;
        }
}
