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
import org.seansawyer.chaturanga.model.dom.Unit;

/**
 * Provides services related to {@link Unit} domain objects.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public interface UnitService
{
    /**
     * Retrieve a non-null {@link List} of all {@link Unit}s
     * 
     * @return a {@link List} of {@link Unit}s
     */
    public List<Unit> getUnits();
    
    /**
     * Retrieve a non-null {@link List} of all {@link Unit}s for a particular {@link Game}
     * 
     * @param game a {@link Game} for which {@link Unit}s should be retrieved
     * @return a {@link List} of {@link Unit}s
     */
    public List<Unit> getUnitsForGame(Game game);
}
