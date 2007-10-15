/*
 * Created on Sep 27, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.service;

import java.util.List;

import org.seansawyer.chaturanga.model.dom.Player;

/**
 * Provides services related to {@link Player} domain objects
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public interface PlayerService
{
    /**
     * Retrieve a non-null {@link List} of all {@link Player}s
     * 
     * @return a {@link List} of {@link Player}s
     */
    public List<Player> getPlayers();
}
