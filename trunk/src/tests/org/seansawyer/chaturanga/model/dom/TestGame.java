/*
 * Created on Oct 22, 2007 by Sean Sawyer
 * 
 * Copyright(c) 2000-2007 Hannon Hill Corporation.  All rights reserved.
 */
package org.seansawyer.chaturanga.model.dom;

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
     */
    @Test(groups = { "unit", "dom", "fast" })
    public void testEquals() {
        // two different instances of a Game with the same scalar data should be considered equal
        Assert.assertNotSame(this.toCompare, this.game);
        Assert.assertEquals(this.toCompare, this.game);
    }
}
