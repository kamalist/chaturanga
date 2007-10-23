/*
 * Created on Oct 22, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
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
