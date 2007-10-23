/*
 * Created on Oct 22, 2007 by Sean Sawyer
 * 
 * This code is licensed under version 3 of the GNU Public License.
 * 
 * Please visit http://code.google.com/p/chaturanga/ for licensing
 * and other information. 
 */
package org.seansawyer.chaturanga.model.dom;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.seansawyer.chaturanga.model.dom.enumerations.Color;
import org.seansawyer.chaturanga.model.dom.enumerations.UnitType;
import org.seansawyer.chaturanga.testng.ChaturangaTestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

/**
 * Base abstract class for domain object unit tests. Sets up some domain objects with
 * scalar fields populated.
 * 
 * @author  Sean Sawyer
 * @version $Id: $
 * @since   0.1
 */
public abstract class DomainObjectTestCase extends ChaturangaTestCase
{
    protected Game game;
    protected Move move;
    protected Player player;
    protected Unit unit;

    /**
     * Invoked before the test class is instantiated; override this method to set up
     * your test environment.
     */
    @BeforeClass
    @Override
    public void setUp()
    {
        super.setUp();
        
        this.game = new Game();
        populateGame(this.game);

        this.move = new Move();
        populateMove(this.move);

        this.player = new Player();
        populatePlayer(this.player);

        this.unit = new Unit();
        populateUnit(this.unit);
    }

    /**
     * Populate a {@link Game} domain object with dummy values suitable for testing.
     */
    protected void populateGame(Game game)
    {
        game.setCheckmate(false);
        game.setEndDate(new Date(0L));
        game.setId("game1");
        game.setStartDate(new Date(0L));
        game.setTagline("A classic game between two grand masters");
        game.setToMove(Color.WHITE);
        game.setWinner(Color.BLACK);
    }

    /**
     * Populate a {@link Move} domain object with dummy values suitable for testing.
     */
    protected void populateMove(Move move)
    {
        move.setColor(Color.WHITE);
        move.setComment("!!");
        move.setDate(0L);
        move.setEndX(0);
        move.setEndY(0);
        move.setId("move1");
        move.setStartX(1);
        move.setStartY(1);
    }

    /**
     * Populate a {@link Player} domain object with dummy values suitable for testing.
     */
    protected void populatePlayer(Player player)
    {
        player.setDateCreated(new Date(0L));
        player.setEmail("player@chaturanga.org");
        player.setEnabled(true);
        player.setFullName("Arto Lindsay");
        player.setId("player1");
        player.setPassword("noonchill");
        player.setUsername("artodna");
    }

    /**
     * Populate a {@link Unit} domain object with dummy values suitable for testing.
     */
    protected void populateUnit(Unit unit)
    {
        unit.setColor(Color.BLACK);
        unit.setId("move1");
        unit.setInPlay(true);
        unit.setPromoted(false);
        unit.setType(UnitType.QUEEN);
        unit.setX(1);
        unit.setY(1);
    }
    
    /**
     * Verify that the specified property, when set to the specified value, breaks the equality
     * between the original and modified objects, and when the previous value is restored, equality
     * is restored as well.
     * 
     * @param original the original object
     * @param toCompare the object that will be changed for purposes of this test
     * @param property the property to modify
     * @param newValue the new value for the property being tested
     * @throws Exception
     */
    protected void verifyPropertyOnEquals(Object original, Object toCompare, String property, Object newValue) throws Exception
    {
        Object originalValue = PropertyUtils.getProperty(toCompare, property);
        BeanUtils.setProperty(toCompare, property, newValue);
        Assert.assertFalse(original.equals(toCompare));
        BeanUtils.setProperty(toCompare, property, originalValue);
        Assert.assertEquals(original, toCompare);
    }
    
    /**
     * Verify that the specified property, when set to the specified value, breaks the equality
     * between the original and modified objects' hash codes, and when the previous value is
     * restored, equality of hash codes is restored as well.
     * 
     * @param original the original object
     * @param toCompare the object that will be changed for purposes of this test
     * @param property the property to modify
     * @param newValue the new value for the property being tested
     * @throws Exception
     */
    protected void verifyPropertyOnHashCode(Object original, Object toCompare, String property, Object newValue) throws Exception
    {
        Object originalValue = PropertyUtils.getProperty(toCompare, property);
        BeanUtils.setProperty(toCompare, property, newValue);
        Assert.assertFalse(original.hashCode() == toCompare.hashCode());
        BeanUtils.setProperty(toCompare, property, originalValue);
        Assert.assertTrue(original.hashCode() == toCompare.hashCode());
    }
}
