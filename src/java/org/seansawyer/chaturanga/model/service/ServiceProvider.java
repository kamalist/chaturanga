/*
 * Created on Oct 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.service;

/**
 * Consolidates access to all services by providing one access point to
 * instances of service implementations.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public interface ServiceProvider
{
    /**
     * @return returns an implementation of {@link GameService}
     */
    public GameService getGameService();

    /**
     * @return returns an implementation of {@link MoveService}
     */
    public MoveService getMoveService();

    /**
     * @return returns an implementation of {@link PlayerService}
     */
    public PlayerService getPlayerService();

    /**
     * @return returns an implementation of {@link UnitService}
     */
    public UnitService getUnitService();
}
