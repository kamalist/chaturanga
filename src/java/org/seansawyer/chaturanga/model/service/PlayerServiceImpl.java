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
 * Implementation of {@link PlayerService}
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public class PlayerServiceImpl implements PlayerService
{
    private List<Player> players;

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.service.PlayerService#getPlayers()
     */
    public final List<Player> getPlayers()
    {
        return players;
    }

    /**
     * Sets the {@link List} of available {@link Player}s. <strong>Used for testing purposes only.</strong> 
     * 
     * @param players a {@link List} of {@link Player}s
     */
    public void setPlayers(List<Player> players)
    {
        this.players = players;
    }
}
