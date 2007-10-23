/*
 * Created on Oct 23, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

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
     * Tests that {@link Move#equals(Object)} functions as expected.
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() {
        // two different instances of a Unit with the same scalar data should be considered equal
        Assert.assertNotSame(this.toCompare, this.unit);
        Assert.assertEquals(this.toCompare, this.unit);
    }
}
