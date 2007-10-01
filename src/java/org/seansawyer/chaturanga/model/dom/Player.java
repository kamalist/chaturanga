/*
 * Created on Aug 15, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;
import java.util.Set;

/**
 * Domain object representing a player in the {@link Game}
 * 
 * @author  Sean Sawyer
 * @version $Id$
 * @since   0.1
 */
public class Player extends BaseDomainObject
{
    private String username;
    private String email;
    private String fullName;
    private String password;
    private boolean enabled;
    private Date dateCreated;
    
    private Set<Game> games;

    /*
     * GETTERS
     ************/

    /**
     * @return Returns the email.
     */
    public final String getEmail()
    {
        return email;
    }

    /**
     * @return Returns the enabled.
     */
    public final boolean isEnabled()
    {
        return enabled;
    }

    /**
     * @return Returns the fullName.
     */
    public final String getFullName()
    {
        return fullName;
    }

    /**
     * @return Returns the password.
     */
    public final String getPassword()
    {
        return password;
    }

    /**
     * @return Returns the username.
     */
    public final String getUsername()
    {
        return username;
    }

    /**
     * @return Returns the dateCreated.
     */
    public final Date getDateCreated()
    {
        return dateCreated;
    }

    /*
     * SETTERS
     ************/

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return Returns the games.
     */
    public final Set<Game> getGames()
    {
        return games;
    }

    /**
     * @param games the games to set
     */
    public void setGames(Set<Game> games)
    {
        this.games = games;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }
}
