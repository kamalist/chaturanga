/*
 * Created on Aug 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Base domain object from which all others are derived
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public abstract class BaseDomainObject
{
    public static final String PROPERTY_ID = "id";
    
    /** Primary key of entity */
    protected Long id;

    /**
     * @return Returns the id.
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets the id to the input id
     * 
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        BaseDomainObject bdo = (BaseDomainObject) obj;
        return new EqualsBuilder().append(this.getId(), bdo.getId()).isEquals();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        HashCodeBuilder builder = new HashCodeBuilder();
        if (this.getId() == null)
        {
            return builder.appendSuper(super.hashCode()).toHashCode();
        }
        return new HashCodeBuilder().append(this.getId()).toHashCode();
    }
}
