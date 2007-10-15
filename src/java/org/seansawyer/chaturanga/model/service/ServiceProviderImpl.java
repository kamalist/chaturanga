/*
 * Created on Oct 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.service;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.InitializingBean;

/**
 * Implementation of {@link ServiceProvider} as a Spring {@link InitializingBean}
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   5.0
 */
public class ServiceProviderImpl implements ServiceProvider, InitializingBean
{
    private GameService gameService;
    private MoveService moveService;
    private PlayerService playerService;
    private UnitService unitService;
    
    /* (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    public void afterPropertiesSet()
    {
        Validate.notNull(gameService);
        Validate.notNull(moveService);
        Validate.notNull(playerService);
        Validate.notNull(unitService);
    }
    
    /*
     * GETTERS
     ************/

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.service.ServiceProvider#getGameService()
     */
    public final GameService getGameService()
    {
        return gameService;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.service.ServiceProvider#getMoveService()
     */
    public final MoveService getMoveService()
    {
        return moveService;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.service.ServiceProvider#getPlayerService()
     */
    public final PlayerService getPlayerService()
    {
        return playerService;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.service.ServiceProvider#getUnitService()
     */
    public final UnitService getUnitService()
    {
        return unitService;
    }
    
    /*
     * SETTERS
     ************/

    /**
     * @param gameService the gameService to set
     */
    public final void setGameService(GameService gameService)
    {
        this.gameService = gameService;
    }

    /**
     * @param moveService the moveService to set
     */
    public final void setMoveService(MoveService moveService)
    {
        this.moveService = moveService;
    }

    /**
     * @param playerService the playerService to set
     */
    public final void setPlayerService(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    /**
     * @param unitService the unitService to set
     */
    public final void setUnitService(UnitService unitService)
    {
        this.unitService = unitService;
    }

}
