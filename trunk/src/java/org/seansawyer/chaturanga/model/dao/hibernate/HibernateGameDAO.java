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

import org.seansawyer.chaturanga.model.dao.GameDAO;
import org.seansawyer.chaturanga.model.dom.Game;

/**
 * Implementation of {@link GameDAO} using Hibernate
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public class HibernateGameDAO extends HibernateBaseDAO implements GameDAO
{

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#delete(java.lang.String)
     */
    public void delete(Long id) throws Exception
    {
        Game toDelete = new Game();
        toDelete.setId(id);
        getHibernateTemplate().delete(toDelete);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#get(java.lang.String)
     */
    public Game get(Long id)
    {
        return (Game) getHibernateTemplate().load(Game.class, id);
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#get(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<Game> getAll()
    {
        return (List<Game>) getHibernateTemplate().find("from Game");
    }

    /* (non-Javadoc)
     * @see org.seansawyer.chaturanga.model.dao.BaseDAO#save(org.seansawyer.chaturanga.model.dom.BaseDomainObject)
     */
    public void save(Game cdo) throws Exception
    {
        getHibernateTemplate().saveOrUpdate(cdo);
    }

}
