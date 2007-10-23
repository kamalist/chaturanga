/*
 * Created on Oct 23, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests that the functionality of non-accessor methods in {@link Player}
 * function as expected.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class TestPlayer extends DomainObjectTestCase
{
    private Player toCompare;
    
    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dom.DomainObjectTestCase#setUp()
     */
    @BeforeClass
    @Override
    public void setUp()
    {
        super.setUp();
        
        this.toCompare = new Player();
        populatePlayer(this.toCompare);
    }
    
    /**
     * Tests that {@link Player#equals(Object)} functions as expected.
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() throws Exception
    {
        // two different instances of a Player with the same scalar data should be considered equal
        Assert.assertNotSame(toCompare, player);
        Assert.assertEquals(toCompare, player);
        
        // changing each of the scalar properties should break equals
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_ID, "player2");
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_DATECREATED, new Date());
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_EMAIL, "another.player@chaturanga.org");
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_ENABLED, !toCompare.isEnabled());
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_FULLNAME, "Ikue Mori");
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_PASSWORD, "hexkitchen");
        verifyPropertyOnEquals(player, toCompare, Player.PROPERTY_USERNAME, "ikuedna");
    }
    
    /**
     * Tests that {@link Player#hashCode()} functions as expected.
     * @throws Exception
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testHashCode() throws Exception
    {
        // two different instances of a Player with the same scalar data should have the same hash code
        Assert.assertTrue(player.hashCode() == toCompare.hashCode());
        
        // changing each of the scalar properties should break hash code equality
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_ID, "player2");
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_DATECREATED, new Date());
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_EMAIL, "another.player@chaturanga.org");
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_ENABLED, !toCompare.isEnabled());
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_FULLNAME, "Ikue Mori");
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_PASSWORD, "hexkitchen");
        verifyPropertyOnHashCode(player, toCompare, Player.PROPERTY_USERNAME, "ikuedna");
    }
}
