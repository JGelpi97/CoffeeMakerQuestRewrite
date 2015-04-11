import com.laboon.Player;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Joshua Zwolan on 2/2/2015.
 * 
 * This contains junit tests for Player.java
 *
 */

public class Player_Tests 
{
    Player p;

    /**
     * Following Tests test Player.hasAllItems()
     *
     */
    
    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with no items
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_NoItems()
    {
        p = new Player(false, false, false);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with coffee
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Coffee()
    {
        p = new Player(true, false, false);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with cream
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Cream()
    {
        p = new Player(false, true, false);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Sugar()
    {
        p = new Player(false, false, true);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with coffee and cream
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CoffeeCream()
    {
        p = new Player(true, true, false);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with coffee and sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CoffeeSugar()
    {
        p = new Player(true, false, true);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns false when a player is created with cream and sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CreamSugar()
    {
        p = new Player(false, true, true);
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that method returns true when a player is created with coffee, sugar, and cream
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasAllItems_AllItems()
    {
        p = new Player(true, true, true);
        assertTrue(p.hasAllItems());
    }

    /**
     * Following Tests test Player.drink()
     *
     */
    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with no items
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_NoItems()
    {
        p = new Player(false, false, false);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with coffee
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Coffee()
    {
        p = new Player(true, false, false);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with cream
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Cream()
    {
        p = new Player(false, true, false);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Sugar()
    {
        p = new Player(false, false, true);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with coffee and cream
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CoffeeCream()
    {
        p = new Player(true, true, false);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with coffee and sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CoffeeSugar()
    {
        p = new Player(true, false, true);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks with cream and sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CreamSugar()
    {
        p = new Player(false, true, true);
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns true when the player drinks with all items
        in their inventory
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_drink_AllItems()
    {
        p = new Player(true, true, true);
        assertTrue(p.drink());
    }

    /**
     * Following Tests test Player.hasAllItems()
     * These use Player.getCoffee(), Player.getCream(), and Player.getSugar()
     *      to set up instead of the constructor with parameters. These also use Player.Player() (the default constructor as well)
     *
     * In other words, this tests to make sure the .getCream(), .getCoffee(), and .getSugar are working along with the
     *      Player.hasAllItems() method
     */
    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used. This
        means that default constructor is not giving the players any items
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_NoItems_EmptyConstructor()
    {
        p = new Player();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives coffee
        through Player.getCoffee() and nothing else. Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Coffee_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives cream
        through Player.getCream() and nothing else. Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Cream_EmptyConstructor()
    {
        p = new Player();
        p.getCream();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives sugar
        through Player.getSugar() and nothing else. Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_Sugar_EmptyConstructor()
    {
        p = new Player();
        p.getSugar();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives coffee
        through Player.getCoffee() and cream through Player.getCream(). Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CoffeeCream_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getCream();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives coffee
        through Player.getCoffee() and sugar through Player.getSugar(). Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CoffeeSugar_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getSugar();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns false when the default constructor is used and the Player receives cream
        through Player.getCream() and sugar through Player.getSugar(). Thus, the player does not have all of the items.
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasAllItems_CreamSugar_EmptyConstructor()
    {
        p = new Player();
        p.getCream();
        p.getSugar();
        assertFalse(p.hasAllItems());
    }

    /*
    - Test Player.hasAllItems()
    - This tests to make sure that the method returns true when the default constructor is used and the Player receives coffee
        through Player.getCoffee(), sugar through Player.getSugar() and cream through Player.getCream(). Thus, the player has all of the items.
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasAllItems_AllItems_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getCream();
        p.getSugar();
        assertTrue(p.hasAllItems());
    }

    /**
     * Following Tests test Player.drink()
     * These use Player.getCoffee(), Player.getCream(), and Player.getSugar() for the player to receive items
     *      instead of using the constructor with parameters. These also use Player.Player() (the default constructor as well)
     *
     * In other words, this tests to make sure the .getCream(), .getCoffee(), and .getSugar are working along with the
     *      Player.drink() method
     */
    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player drinks no items. This uses the default constructor
        which gives the player no items
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_NoItems_EmptyConstructor()
    {
        p = new Player();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks coffee. This uses the default constructor
        which gives the player no items
    - Coffee was given to the player using Player.getCoffee()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Coffee_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks cream. This uses the default constructor
        which gives the player no items
    - Cream was given to the player using Player.getCream()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Cream_EmptyConstructor()
    {
        p = new Player();
        p.getCream();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks sugar. This uses the default constructor
        which gives the player no items
    - Sugar was given to the player using Player.getSugar()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_Sugar_EmptyConstructor()
    {
        p = new Player();
        p.getSugar();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks coffee and cream. This uses the default constructor
        which gives the player no items
    - Coffee was given to the player using Player.getCoffee()
    - Cream was given to the player using Player.getCream()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CoffeeCream_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getCream();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks coffee and sugar. This uses the default constructor
        which gives the player no items
    - Coffee was given to the player using Player.getCoffee()
    - Sugar was given to the player using Player.getSugar()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CoffeeSugar_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getSugar();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns false when the player just drinks cream and sugar. This uses the default constructor
        which gives the player no items
    - Cream was given to the player using Player.getCream()
    - Sugar was given to the player using Player.getSugar()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_CreamSugar_EmptyConstructor()
    {
        p = new Player();
        p.getCream();
        p.getSugar();
        assertFalse(p.drink());
    }

    /*
    - Test Player.drink()
    - This tests to make sure that the method returns true when the player drinks all of the items. This uses the default constructor
        which gives the player no items
    - Coffee was given to the player using Player.getCoffee()
    - Cream was given to the player using Player.getCream()
    - Sugar was given to the player using Player.getSugar()
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_drink_AllItems_EmptyConstructor()
    {
        p = new Player();
        p.getCoffee();
        p.getCream();
        p.getSugar();
        assertTrue(p.drink());
    }
}
