/*
 * Created on Oct 22, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;

import org.seansawyer.chaturanga.model.dom.enumerations.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests that the functionality of non-accessor methods in {@link Game}
 * function as expected.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class TestGame extends DomainObjectTestCase
{
    private Game toCompare;
    
    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.DomainObjectTestCase#setUp()
     */
    @BeforeClass
    @Override
    public void setUp()
    {
        super.setUp();
        
        this.toCompare = new Game();
        populateGame(this.toCompare);
    }
    
    /**
     * Tests that {@link Game#equals(Object)} functions as expected.
     * @throws Exception
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() throws Exception
    {
        // two different instances of a Game with the same scalar data should be considered equal
        Assert.assertNotSame(game, toCompare);
        Assert.assertEquals(game, toCompare);
        
        // changing each of the scalar properties should break equals
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_ID, "game2");
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_CHECKMATE, !toCompare.isCheckmate());
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_ENDDATE, new Date());
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_STARTDATE, new Date());
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_TAGLINE, "A mere skirmish betwixt lowly novices");
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_TOMOVE, Color.BLACK);
        verifyPropertyOnEquals(game, toCompare, Game.PROPERTY_WINNER, Color.WHITE);
    }
    
    /**
     * Tests that {@link Game#hashCode()} functions as expected.
     * @throws Exception
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testHashCode() throws Exception
    {
        // two different instances of a Game with the same scalar data should have the same hash code
        Assert.assertTrue(game.hashCode() == toCompare.hashCode());
        
        // changing each of the scalar properties should break hash code equality
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_ID, "game2");
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_CHECKMATE, !toCompare.isCheckmate());
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_ENDDATE, new Date());
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_STARTDATE, new Date());
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_TAGLINE, "A mere skirmish betwixt lowly novices");
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_TOMOVE, Color.BLACK);
        verifyPropertyOnHashCode(game, toCompare, Game.PROPERTY_WINNER, Color.WHITE);
    }
}
