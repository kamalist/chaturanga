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

import org.seansawyer.chaturanga.model.dao.MoveDAO;
import org.seansawyer.chaturanga.model.dom.Move;

/**
 * Implementation of {@link MoveDAO} using Hibernate
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class HibernateMoveDAO extends HibernateBaseDAO implements MoveDAO
{

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#delete(java.lang.String)
     */
    public void delete(Long id) throws Exception
    {
        Move toDelete = new Move();
        toDelete.setId(id);
        getHibernateTemplate().delete(toDelete);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#get(java.lang.String)
     */
    public Move get(Long id)
    {
        return (Move) getHibernateTemplate().load(Move.class, id);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    public List<Move> getAll()
    {
        return (List<Move>) getHibernateTemplate().find("from Move");
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#save(org.seansawyer.chaturanga.model.dom.BaseDomainObject)
     */
    public void save(Move cdo) throws Exception
    {
        getHibernateTemplate().saveOrUpdate(cdo);
    }

}
