/*
 * Created on Oct 24, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.testng;

import java.util.ArrayList;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * Base integration test class from which all Chaturanga integration test case classes are derived.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class ChaturangaIntegrationTestCase extends AbstractDependencyInjectionSpringContextTests
{
    /* (non-Javadoc)
     * @see org.springframework.test.AbstractSingleSpringContextTests#getConfigLocations()
     */
    @Override
    protected String[] getConfigLocations()
    {
        ArrayList<String> locations = new ArrayList<String>();
        
        locations.add("classpath:org.seansawyer.chaturanga.config.spring.chaturanga-servlet.xml");
        
        return locations.toArray(new String[locations.size()]);
    }
}
