/*
 * Created on Oct 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.service;

import java.util.List;

import org.seansawyer.chaturanga.model.dom.Game;
import org.seansawyer.chaturanga.model.dom.Player;

/**
 * Provides services related to {@link Game} domain objects.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   1.0
 */
public interface GameService
{
    /**
     * Retrieve a non-null {@link List} of all {@link Game}s
     * 
     * @return a {@link List} of {@link Game}s
     */
    public List<Game> getGames();
    
    /**
     * Retrieve a non-null {@link List} of all {@link Game}s for a particular {@link Player}
     * 
     * @param player a {@link Player} for which {@link Game}s should be retrieved
     * @return a {@link List} of {@link Game}s
     */
    public List<Game> getGamesForPlayer(Player player);
}