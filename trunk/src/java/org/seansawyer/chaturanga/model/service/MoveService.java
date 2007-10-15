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
import org.seansawyer.chaturanga.model.dom.Move;

/**
 * Provides services related to {@link Move} domain objects.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public interface MoveService
{
    /**
     * Retrieve a non-null {@link List} of all {@link Move}s
     * 
     * @return a {@link List} of {@link Move}s
     */
    public List<Move> getMoves();
    
    /**
     * Retrieve a non-null {@link List} of all {@link Move}s for a particular {@link Game}
     * 
     * @param game a {@link Game} for which {@link Move}s should be retrieved
     * @return a {@link List} of {@link Move}s
     */
    public List<Move> getMovesForGame(Game game);
}
