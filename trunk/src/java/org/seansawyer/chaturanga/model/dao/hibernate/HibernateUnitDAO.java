/*
 * Created on Oct 24, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dao.hibernate;

import java.util.List;

import org.seansawyer.chaturanga.model.dao.UnitDAO;
import org.seansawyer.chaturanga.model.dom.Unit;

/**
 * Implementation of {@link UnitDAO} using Hibernate
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class HibernateUnitDAO extends HibernateBaseDAO implements UnitDAO
{

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#delete(java.lang.String)
     */
    public void delete(Long id) throws Exception
    {
        Unit toDelete = new Unit();
        toDelete.setId(id);
        getHibernateTemplate().delete(toDelete);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#get(java.lang.String)
     */
    public Unit get(Long id)
    {
        return (Unit) getHibernateTemplate().load(Unit.class, id);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    public List<Unit> getAll()
    {
        return (List<Unit>) getHibernateTemplate().find("from Unit");
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#save(org.seansawyer.chaturanga.model.dom.BaseDomainObject)
     */
    public void save(Unit cdo) throws Exception
    {
        getHibernateTemplate().saveOrUpdate(cdo);
    }

}
