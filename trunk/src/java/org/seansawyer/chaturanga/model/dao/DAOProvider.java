/*
 * Created on Oct 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dao;

/**
 * Consolidates access to DAO implementations by providing
 * one access point to implementations of DAO interfaces.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public interface DAOProvider
{
    /**
     * Get an instance of {@link GameDAO}
     * 
     * @return a {@link GameDAO}
     */
    public GameDAO getGameDAO();

    /**
     * Get an instance of {@link MoveDAO}
     * 
     * @return a {@link MoveDAO}
     */
    public MoveDAO getMoveDAO();

    /**
     * Get an instance of {@link PlayerDAO}
     * 
     * @return a {@link PlayerDAO}
     */
    public PlayerDAO getPlayerDAO();

    /**
     * Get an instance of {@link UnitDAO}
     * 
     * @return a {@link UnitDAO}
     */
    public UnitDAO getUnitDAO();
}
