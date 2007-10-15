/*
 * Created on Oct 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dao;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.InitializingBean;

/**
 * Implementation of {@link DAOProvider} as a Spring {@link InitializingBean}
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class DAOProviderImpl implements DAOProvider, InitializingBean
{
    private GameDAO gameDAO;
    private MoveDAO moveDAO;
    private PlayerDAO playerDAO;
    private UnitDAO unitDAO;
    
    /* (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    public void afterPropertiesSet()
    {
        Validate.notNull(gameDAO);
        Validate.notNull(moveDAO);
        Validate.notNull(playerDAO);
        Validate.notNull(unitDAO);
    }
    
    /*
     * GETTERS
     ************/    

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.DAOProvider#getGameDAO()
     */
    public final GameDAO getGameDAO()
    {
        return gameDAO;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.DAOProvider#getMoveDAO()
     */
    public final MoveDAO getMoveDAO()
    {
        return moveDAO;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.DAOProvider#getPlayerDAO()
     */
    public final PlayerDAO getPlayerDAO()
    {
        return playerDAO;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.DAOProvider#getUnitDAO()
     */
    public final UnitDAO getUnitDAO()
    {
        return unitDAO;
    }
    
    /*
     * SETTERS
     ************/

    /**
     * @param gameDAO the gameDAO to set
     */
    public final void setGameDAO(GameDAO gameDAO)
    {
        this.gameDAO = gameDAO;
    }

    /**
     * @param moveDAO the moveDAO to set
     */
    public final void setMoveDAO(MoveDAO moveDAO)
    {
        this.moveDAO = moveDAO;
    }

    /**
     * @param playerDAO the playerDAO to set
     */
    public final void setPlayerDAO(PlayerDAO playerDAO)
    {
        this.playerDAO = playerDAO;
    }

    /**
     * @param unitDAO the unitDAO to set
     */
    public final void setUnitDAO(UnitDAO unitDAO)
    {
        this.unitDAO = unitDAO;
    }
}
