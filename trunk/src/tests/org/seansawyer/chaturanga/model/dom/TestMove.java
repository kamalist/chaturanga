/*
 * Created on Oct 23, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import org.seansawyer.chaturanga.model.dom.enumerations.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests that the functionality of non-accessor methods in {@link Move}
 * function as expected.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class TestMove extends DomainObjectTestCase
{
    private Move toCompare;
    
    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.DomainObjectTestCase#setUp()
     */
    @BeforeClass
    @Override
    public void setUp()
    {
        super.setUp();
        
        this.toCompare = new Move();
        populateMove(this.toCompare);
    }
    
    /**
     * Tests that {@link Move#equals(Object)} functions as expected.
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() throws Exception
    {
        // two different instances of a Move with the same scalar data should be considered equal
        Assert.assertNotSame(move, toCompare);
        Assert.assertEquals(move, toCompare);
        
        // changing each of the scalar properties should break equals
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_ID, "move2");
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_COLOR, Color.BLACK);
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_COMMENT, "??");
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_DATE, 123L);
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_ENDX, toCompare.getEndX() + 1);
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_ENDY, toCompare.getEndY() + 1);
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_STARTX, toCompare.getStartX() + 1);
        verifyPropertyOnEquals(move, toCompare, Move.PROPERTY_STARTY, toCompare.getStartY() + 1);
    }
    
    /**
     * Tests that {@link Move#hashCode()} functions as expected.
     * @throws Exception
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testHashCode() throws Exception
    {
        // two different instances of a Move with the same scalar data should have the same hash code
        Assert.assertTrue(move.hashCode() == toCompare.hashCode());
        
        // changing each of the scalar properties should break hash code equality
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_ID, "move2");
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_COLOR, Color.BLACK);
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_COMMENT, "??");
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_DATE, 123L);
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_ENDX, toCompare.getEndX() + 1);
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_ENDY, toCompare.getEndY() + 1);
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_STARTX, toCompare.getStartX() + 1);
        verifyPropertyOnHashCode(move, toCompare, Move.PROPERTY_STARTY, toCompare.getStartY() + 1);
    }
}
