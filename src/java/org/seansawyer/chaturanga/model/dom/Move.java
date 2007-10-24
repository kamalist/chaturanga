/*
 * Created on Aug 21, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
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
    public static final String PROPERTY_STARTX = "startX";
    public static final String PROPERTY_STARTY = "startY";
    public static final String PROPERTY_ENDX = "endX";
    public static final String PROPERTY_ENDY = "endY";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_COMMENT = "comment";
    public static final String PROPERTY_COLOR = "color";
    
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Date date;
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
    public final Date getDate()
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
    public void setDate(Date date)
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

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.BaseDomainObject#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        Move m = (Move) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj)).append(this.getColor(), m.getColor()).append(this.getComment(), m.getComment()).append(this.getDate(), m.getDate()).append(
                this.getEndX(), m.getEndX()).append(this.getEndY(), m.getEndY()).append(this.getStartX(), m.getStartX()).append(this.getStartY(), m.getStartY()).isEquals();
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.BaseDomainObject#hashCode()
     */
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(this.getColor()).append(this.getComment()).append(this.getDate()).append(this.getEndX()).append(this.getEndY()).append(
                this.getStartX()).append(this.getStartY()).toHashCode();
    }
}
