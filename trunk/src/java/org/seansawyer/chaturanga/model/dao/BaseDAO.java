/*
 * Created on Sep 28, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dao;

import org.seansawyer.chaturanga.model.dom.BaseDomainObject;

/**
 * Interface describing data access methods for all persisted domain objects
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public interface BaseDAO<CDO extends BaseDomainObject> extends ChaturangaDAO
{
    /**
     * 
     * @param id
     * @return
     */
    public CDO get(String id);
    
    /**
     * 
     * @return
     */
    public CDO getAll();

    /**
     * 
     * @param cdo
     * @throws Exception
     */
    public void save(CDO cdo) throws Exception;

    /**
     * 
     * @param id
     * @throws Exception
     */
    public void delete(String id) throws Exception;
}
