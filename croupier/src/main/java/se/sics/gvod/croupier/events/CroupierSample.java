/**
 * This file is part of the Kompics P2P Framework.
 *
 * Copyright (C) 2009 Swedish Institute of Computer Science (SICS)
 * Copyright (C) 2009 Royal Institute of Technology (KTH)
 *
 * Kompics is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package se.sics.gvod.croupier.events;

import java.util.List;
import se.sics.gvod.common.VodDescriptor;
import se.sics.kompics.Event;

/**
 * Random view event raised by {@link Croupier} always after shuffling. 
 * 
 */
public class CroupierSample extends Event
{
    private final List<VodDescriptor> nodes;

    public CroupierSample(List<VodDescriptor> nodes) {
        this.nodes = nodes;
    }
    public List<VodDescriptor> getNodes() {
        return nodes;
    }
}    
