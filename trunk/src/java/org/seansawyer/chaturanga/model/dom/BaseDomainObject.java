/*
 * Created on Aug 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

/**
 * Base domain object from which all others are derived
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public abstract class BaseDomainObject
{
    /** Primary key of entity */
    protected String id;

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the id to the input id
     * 
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

}
