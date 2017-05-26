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

#ifndef librevisa_vxi_resource_creator_h_
#define librevisa_vxi_resource_creator_h_ 1

#include "vxi_resource.h"

#include "resource_creator.h"

namespace librevisa {
namespace vxi {

class vxi_resource::creator :
        public resource_creator
{
private:
        creator();
        ~creator() throw();

        virtual vxi_resource *create(std::vector<std::string> const &) const;
        virtual void find(findlist &) const { }

        static creator instance;
};

}
}

#endif
