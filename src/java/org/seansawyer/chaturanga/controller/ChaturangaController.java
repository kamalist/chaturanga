/*
 * Created on Sep 18, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seansawyer.chaturanga.model.service.PlayerService;
import org.seansawyer.chaturanga.view.ViewConstants;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller associated with the browser view for the application 
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public class ChaturangaController implements Controller
{
    /** Protected logger for the {@link ChaturangaController} and its subclasses */
    protected final Log LOG = LogFactory.getLog(getClass());

    private PlayerService playerService;
    
    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        return new ModelAndView(ViewConstants.VIEW_HELLO, ViewConstants.GLOBAL_BEAN_MODEL_MAP, buildModelMap());
    }

    /**
     * Build the map containing all the model information for the view, keyed on {@link String}s
     * contained in {@link ViewConstants}
     * 
     * @return a {@link Map} of model information, keyed by {@link String}
     */
    protected Map buildModelMap()
    {
        //TODO move this logic to a package of model map builders keyed on the view name
        String now = (new java.util.Date()).toString();

        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put(ViewConstants.VIEW_HELLO_MAP_KEY_NOW, now);
        modelMap.put(ViewConstants.GLOBAL_MAP_KEY_PLAYERS, getPlayerService().getPlayers());
        
        return modelMap;
    }

    /**
     * @return Returns the playerService.
     */
    public PlayerService getPlayerService()
    {
        return playerService;
    }

    /**
     * @param playerService the playerService to set
     */
    public void setPlayerService(PlayerService playerService)
    {
        this.playerService = playerService;
    }
}
