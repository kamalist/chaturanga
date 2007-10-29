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

import org.seansawyer.chaturanga.model.dao.PlayerDAO;
import org.seansawyer.chaturanga.model.dom.Player;

/**
 * Implementation of {@link PlayerDAO} using Hibernate
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class HibernatePlayerDAO extends HibernateBaseDAO implements PlayerDAO
{

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#delete(java.lang.String)
     */
    public void delete(Long id) throws Exception
    {
        Player toDelete = new Player();
        toDelete.setId(id);
        getHibernateTemplate().delete(toDelete);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#get(java.lang.String)
     */
    public Player get(Long id)
    {
        return (Player) getHibernateTemplate().load(Player.class, id);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    public List<Player> getAll()
    {
        return (List<Player>) getHibernateTemplate().find("from Player");
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#save(org.seansawyer.chaturanga.model.dom.BaseDomainObject)
     */
    public void save(Player cdo) throws Exception
    {
        getHibernateTemplate().saveOrUpdate(cdo);
    }

}
