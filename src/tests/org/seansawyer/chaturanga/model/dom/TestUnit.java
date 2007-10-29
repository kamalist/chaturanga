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
import org.seansawyer.chaturanga.model.dom.enumerations.UnitType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests that the functionality of non-accessor methods in {@link Unit}
 * function as expected.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class TestUnit extends DomainObjectTestCase
{
    private Unit toCompare;
    
    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.DomainObjectTestCase#setUp()
     */
    @BeforeClass
    @Override
    public void setUp()
    {
        super.setUp();
        
        this.toCompare = new Unit();
        populateUnit(this.toCompare);
    }
    
    /**
     * Tests that {@link Unit#equals(Object)} functions as expected.
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() throws Exception
    {
        // two different instances of a Unit with the same scalar data should be considered equal
        Assert.assertNotSame(unit, toCompare);
        Assert.assertEquals(unit, toCompare);
        
        // changing each of the scalar properties should break equals
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_ID, toCompare.getId() + 1);
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_COLOR, Color.WHITE);
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_INPLAY, !toCompare.isInPlay());
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_PROMOTED, !toCompare.isPromoted());
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_UNITTYPE, UnitType.PAWN);
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_X, toCompare.getX() + 1);
        verifyPropertyOnEquals(unit, toCompare, Unit.PROPERTY_Y, toCompare.getY() + 1);
    }
    
    /**
     * Tests that {@link Unit#hashCode()} functions as expected.
     * @throws Exception
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testHashCode() throws Exception
    {
        // two different instances of a Unit with the same scalar data should have the same hash code
        Assert.assertTrue(unit.hashCode() == toCompare.hashCode());
        
        // changing each of the scalar properties should break hash code equality
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_ID, toCompare.getId() + 1);
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_COLOR, Color.WHITE);
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_INPLAY, !toCompare.isInPlay());
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_PROMOTED, !toCompare.isPromoted());
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_UNITTYPE, UnitType.PAWN);
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_X, toCompare.getX() + 1);
        verifyPropertyOnHashCode(unit, toCompare, Unit.PROPERTY_Y, toCompare.getY() + 1);
    }
}
