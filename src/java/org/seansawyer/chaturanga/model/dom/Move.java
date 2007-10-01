/*
 * Created on Aug 21, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import org.seansawyer.chaturanga.model.dom.enumerations.Color;

/**
 * Represents a move of one {@link Unit} by a {@link Player} in a {@link Game}
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public class Move extends BaseDomainObject
{
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Long date;
    private String comment;
    
    private Color color;
    private Game game;
    private Move previous;
    private Move next;

    /*
     * GETTERS
     ************/

    /**
     * @return Returns the color.
     */
    public final Color getColor()
    {
        return color;
    }

    /**
     * @return Returns the date.
     */
    public final Long getDate()
    {
        return date;
    }

    /**
     * @return Returns the endX.
     */
    public final int getEndX()
    {
        return endX;
    }

    /**
     * @return Returns the endY.
     */
    public final int getEndY()
    {
        return endY;
    }

    /**
     * @return Returns the game.
     */
    public final Game getGame()
    {
        return game;
    }

    /**
     * @return Returns the startX.
     */
    public final int getStartX()
    {
        return startX;
    }

    /**
     * @return Returns the startY.
     */
    public final int getStartY()
    {
        return startY;
    }

    /**
     * @return Returns the comment.
     */
    public final String getComment()
    {
        return comment;
    }

    /**
     * @return Returns the next.
     */
    public final Move getNext()
    {
        return next;
    }

    /**
     * @return Returns the previous.
     */
    public final Move getPrevious()
    {
        return previous;
    }

    /*
     * SETTERS
     ************/

    /**
     * @param color the color to set
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Long date)
    {
        this.date = date;
    }

    /**
     * @param endX the endX to set
     */
    public void setEndX(int endX)
    {
        this.endX = endX;
    }

    /**
     * @param endY the endY to set
     */
    public void setEndY(int endY)
    {
        this.endY = endY;
    }

    /**
     * @param game the game to set
     */
    public void setGame(Game game)
    {
        this.game = game;
    }

    /**
     * @param startX the startX to set
     */
    public void setStartX(int startX)
    {
        this.startX = startX;
    }

    /**
     * @param startY the startY to set
     */
    public void setStartY(int startY)
    {
        this.startY = startY;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Move next)
    {
        this.next = next;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Move previous)
    {
        this.previous = previous;
    }
}
