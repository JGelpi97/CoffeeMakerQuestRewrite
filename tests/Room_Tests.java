package tests;

import com.laboon.Room;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Joshua Zwolan on 2/2/2015.
 *
 * This contains junit tests for Room.java
 *  
 */

public class Room_Tests 
{
    Room r;

    /**
     * Following Tests test Room.hasItem() 
     */
    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns false when the room is created with no items
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasItem_NoItems()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with only coffee
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_Coffee()
    {
        r = new Room(true,false,false,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with only cream
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_Cream()
    {
        r = new Room(false,true,false,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with only sugar
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_Sugar()
    {
        r = new Room(false,false,true,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with coffee and cream
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_CoffeeCream()
    {
        r = new Room(true,true,false,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with coffee and sugar
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_CoffeeSugar()
    {
        r = new Room(true,false,true,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with sugar and cream
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_SugarCream()
    {
        r = new Room(false,true,true,false,false);
        assertTrue(r.hasItem());
    }

    /*
    - Test Room.hasItem()
    - This tests to make sure that method returns true when the room is created with coffee, cream, sugar
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasItem_CoffeeSugarCream()
    {
        r = new Room(true,true,true,false,false);
        assertTrue(r.hasItem());
    }

    /**
     * Following Tests test: 
     *      Room.hasCoffee() 
     *      Room.hasSugar()
     *      Room.hasCream()
     *      Room.northExit()
     *      Room.southExit()      
     */
    /*
    - Test Room.hasCoffee()
    - This tests to make sure that method returns true when the room is created with coffee
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasCoffee_Coffee()
    {
        r = new Room(true,false,false,false,false);
        assertTrue(r.hasCoffee());
    }

    /*
    - Test Room.hasCoffee()
    - This tests to make sure that method returns false when the room is created with no coffee
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasCoffee_NoCoffee()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.hasCoffee());
    }

    /*
    - Test Room.hasCream()
    - This tests to make sure that method returns true when the room is created with cream
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasCream_Cream()
    {
        r = new Room(false,true,false,false,false);
        assertTrue(r.hasCream());
    }

    /*
    - Test Room.hasCream()
    - This tests to make sure that method returns false when the room is created with no cream
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasCream_NoCream()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.hasCream());
    }

    /*
    - Test Room.hasSugar()
    - This tests to make sure that method returns true when the room is created with sugar
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_hasSugar_Sugar()
    {
        r = new Room(false,false,true,false,false);
        assertTrue(r.hasSugar());
    }

    /*
    - Test Room.hasSugar()
    - This tests to make sure that method returns false when the room is created with no sugar
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_hasSugar_NoSugar()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.hasSugar());
    }

    /**
     * Following Tests test Room.northExit() 
     */
    /*
    - Test Room.northExit()
    - This tests to make sure that method returns true when there exists a north exit
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_northExit_ExitAvailable()
    {
        r = new Room(false,false,false,true,false);
        assertTrue(r.northExit());
    }

    /*
    - Test Room.northExit()
    - This tests to make sure that method returns false when there does not exists a north exit
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_northExit_NoExit()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.northExit());
    }

    /**
     * Following Tests test Room.southExit()
     */
    /*
    - Test Room.southExit()
    - This tests to make sure that method returns true when there exists a south exit
    - To Pass:      Method returns true
    - Expected Output:  true
     */
    @Test
    public void test_southExit_ExitAvailable()
    {
        r = new Room(false,false,false,false,true);
        assertTrue(r.southExit());
    }

    /*
    - Test Room.southExit()
    - This tests to make sure that method returns false when there does not exists a south exit
    - To Pass:      Method returns false
    - Expected Output:  false
     */
    @Test
    public void test_southExit_NoExit()
    {
        r = new Room(false,false,false,false,false);
        assertFalse(r.southExit());
    }

    /**
     * Following Tests test Room.getDescription() 
     * These tests ensure that the room description is properly showing that an
     *  exit exists when there is indeed an exit
     */
    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String contains "door leads North"
    - This means description is properly displaying a north exit
    - To Pass:      The returned String contains "door leads North"
    - Expected Output:  The Description that is displayed contains the string "door leads North"
     */
    @Test
    public void test_getDescription_NorthExitAvailable()
    {
        r = new Room(false, false, false, true, false);
        assertTrue(r.getDescription().contains("door leads North."));
    }

    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String does not contain "door leads North"
    - This means description is properly not showing a north exit when one does not exist
    - To Pass:      The returned String does not contain "door leads North"
    - Expected Output:  The Description that is displayed does not contain the string "door leads North"
     */
    @Test
    public void test_getDescription_NorthExitNotAvailable()
    {
        r = new Room(false, false, false, false, false);
        assertTrue(!r.getDescription().contains("door leads North."));
    }

    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String contains "door leads South"
    - This means description is properly displaying a south exit
    - To Pass:      The returned String contains "door leads South"
    - Expected Output:  The Description that is displayed contains the string "door leads South"
     */
    @Test
    public void test_getDescription_SouthExitAvailable()
    {
        r = new Room(false, false, false, false, true);
        assertTrue(r.getDescription().contains("door leads South."));
    }

    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String does not contain "door leads South"
    - This means description is properly not showing a south exit when one does not exist
    - To Pass:      The returned String does not contain "door leads South"
    - Expected Output:  The Description that is displayed does not contain the string "door leads South"
     */
    @Test
    public void test_getDescription_SouthExitNotAvailable()
    {
        r = new Room(false, false, false, false, false);
        assertTrue(!r.getDescription().contains("door leads South."));
    }
    
    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String contains "door leads South" and "door leads North"
    - This means description is properly displaying a north and south exit
    - To Pass:      The returned String contains "door leads South" and "door leads North"
    - Expected Output:  The Description that is displayed contains the string "door leads North" and the string
            "door leads South"
     */
    @Test
    public void test_getDescription_North_AND_SouthExitAvailable()
    {
        r = new Room(false, false, false, true, true);
        assertTrue(r.getDescription().contains("door leads North.") && r.getDescription().contains("door leads South."));
    }

    /*
    - Test Room.getDescription()
    - This tests to make sure that the returned String does not contain "door leads South" and "door leads North"
    - This means description is properly not showing a north and south exit when they do not exist
    - To Pass:      The returned String does not contain "door leads South" and "door leads North"
    - Expected Output:  The Description that is displayed does not contain the string "door leads North" and the string
            "door leads South"
     */
    @Test
    public void test_getDescription_North_AND_SouthExitNotAvailable()
    {
        r = new Room(false, false, false, false, false);
        assertTrue(!r.getDescription().contains("door leads North.") && !r.getDescription().contains("door leads South."));
    }
}
