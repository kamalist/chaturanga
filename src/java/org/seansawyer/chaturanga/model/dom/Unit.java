/*
 * Created on Aug 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import org.seansawyer.chaturanga.model.dom.enumerations.Color;
import org.seansawyer.chaturanga.model.dom.enumerations.UnitType;

/**
 * Domain object representing one unit (or piece) in the {@link Game}
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public class Unit extends BaseDomainObject
{
    private boolean inPlay;
    private boolean promoted;
    private int x;
    private int y;

    private Color color;
    private Game game;
    private UnitType type;

    /*
     * GETTERS
     ************/

    /**
     * @return Returns the promoted.
     */
    public final boolean isPromoted()
    {
        return promoted;
    }

    /**
     * @return Returns the type.
     */
    public final UnitType getType()
    {
        return type;
    }

    /**
     * @return Returns the x.
     */
    public final int getX()
    {
        return x;
    }

    /**
     * @return Returns the y.
     */
    public final int getY()
    {
        return y;
    }

    /**
     * @return Returns the color.
     */
    public final Color getColor()
    {
        return color;
    }

    /**
     * @return Returns the game.
     */
    public final Game getGame()
    {
        return game;
    }

    /**
     * @return Returns the inPlay.
     */
    public final boolean isInPlay()
    {
        return inPlay;
    }

    /*
     * SETTERS
     ************/

    /**
     * @param type the type to set
     */
    public void setType(UnitType type)
    {
        this.type = type;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /**
     * @param game the game to set
     */
    public void setGame(Game game)
    {
        this.game = game;
    }

    /**
     * @param inPlay the inPlay to set
     */
    public void setInPlay(boolean inPlay)
    {
        this.inPlay = inPlay;
    }

    /**
     * @param promoted the promoted to set
     */
    public void setPromoted(boolean promoted)
    {
        this.promoted = promoted;
    }
}