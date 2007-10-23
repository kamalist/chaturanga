/*
 * Created on Aug 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.seansawyer.chaturanga.model.dom.enumerations.Color;

/**
 * Represents the state of one game being played by two {@link Player}s
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since 0.1
 */
public class Game extends BaseDomainObject
{
    public static final String PROPERTY_CHECKMATE = "checkmate";
    public static final String PROPERTY_STARTDATE = "startDate";
    public static final String PROPERTY_ENDDATE = "endDate";
    public static final String PROPERTY_TAGLINE = "tagline";
    public static final String PROPERTY_WINNER = "winner";
    public static final String PROPERTY_TOMOVE = "toMove";
    
    private boolean checkmate;
    private Date startDate;
    private Date endDate;
    private String tagline;

    private Color winner;
    private Color toMove;
    private Player black;
    private Player white;
    private Set<Unit> units;
    private Move firstMove;
    private Move lastMove;
    private Set<Move> moves;

    /*
     * GETTERS
     *************/

    /**
     * @return Returns the black.
     */
    public final Player getBlack()
    {
        return black;
    }

    /**
     * @return Returns the blackCaptures.
     */
    public final Set<Unit> getUnits()
    {
        return units;
    }

    /**
     * @return Returns the checkmate.
     */
    public final boolean isCheckmate()
    {
        return checkmate;
    }

    /**
     * @return Returns the white.
     */
    public final Player getWhite()
    {
        return white;
    }

    /**
     * @return Returns the winner.
     */
    public final Color getWinner()
    {
        return winner;
    }

    /**
     * @return Returns the toMove.
     */
    public final Color getToMove()
    {
        return toMove;
    }

    /**
     * @return Returns the endDate.
     */
    public final Date getEndDate()
    {
        return endDate;
    }

    /**
     * @return Returns the startDate.
     */
    public final Date getStartDate()
    {
        return startDate;
    }

    /**
     * @return Returns the firstMove.
     */
    public final Move getFirstMove()
    {
        return firstMove;
    }

    /**
     * @return Returns the lastMove.
     */
    public final Move getLastMove()
    {
        return lastMove;
    }

    /**
     * @return Returns the moves.
     */
    public final Set<Move> getMoves()
    {
        return moves;
    }

    /**
     * @return Returns the tagline.
     */
    public final String getTagline()
    {
        return tagline;
    }

    /*
     * SETTERS 
     ************/

    /**
     * @param black the black to set
     */
    public void setBlack(Player black)
    {
        this.black = black;
    }

    /**
     * @param blackCaptures the blackCaptures to set
     */
    public void setUnits(Set<Unit> blackCaptures)
    {
        this.units = blackCaptures;
    }

    /**
     * @param checkmate the checkmate to set
     */
    public void setCheckmate(boolean checkmate)
    {
        this.checkmate = checkmate;
    }

    /**
     * @param white the white to set
     */
    public void setWhite(Player white)
    {
        this.white = white;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(Color winner)
    {
        this.winner = winner;
    }

    /**
     * @param toMove the toMove to set
     */
    public void setToMove(Color toMove)
    {
        this.toMove = toMove;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    /**
     * @param firstMove the firstMove to set
     */
    public void setFirstMove(Move firstMove)
    {
        this.firstMove = firstMove;
    }

    /**
     * @param lastMove the lastMove to set
     */
    public void setLastMove(Move lastMove)
    {
        this.lastMove = lastMove;
    }

    /**
     * @param moves the moves to set
     */
    public void setMoves(Set<Move> moves)
    {
        this.moves = moves;
    }

    /**
     * @param tagline the tagline to set
     */
    public void setTagline(String tagline)
    {
        this.tagline = tagline;
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.BaseDomainObject#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        Game g = (Game) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj)).append(this.getEndDate(), g.getEndDate()).append(this.getStartDate(), g.getStartDate()).append(this.getTagline(), g.getTagline())
                .append(this.getToMove(), g.getToMove()).append(this.getWinner(), g.getWinner()).append(this.isCheckmate(), g.isCheckmate()).isEquals();
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.BaseDomainObject#hashCode()
     */
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(this.getEndDate()).append(this.getStartDate()).append(this.getTagline()).append(this.getToMove()).append(this.getWinner())
                .append(this.isCheckmate()).toHashCode();
    }
}
