/*
 * Created on Oct 22, 2007 by Sean Sawyer
 * 
 * Copyright(c) 2000-2007 Hannon Hill Corporation.  All rights reserved.
 */
package org.seansawyer.chaturanga.testng;

import org.testng.annotations.BeforeClass;

/**
 * Base unit test case class from which all Chaturanga unit tests are derived. 
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public abstract class ChaturangaTestCase
{    
    /**
     * Invoked before the test class is instantiated; override this method to set up
     * your test environment.
     */
    @BeforeClass
    public void setUp() {
        
    }
}
