import com.laboon.House;
import com.laboon.Player;
import com.laboon.Room;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * Created by Joshua Zwolan on 2/1/2015.
 *
 * This contains junit tests for House.java
 *
 */

public class House_Tests
{
    House h;

    ByteArrayOutputStream outContent;
    ByteArrayOutputStream errContent;

    /*
    - Before Method: This is Called before Every Test
    - Creates a sub of the House and Player classes
    - Creates the Game Object for Testing
    - Configures system out and system error to print to a String (Used for Tests)
     */
    @Before
    public void init()
    {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /*
    - After Method
    - Sets the System out and system error to null
     */
    @After
    public void tearDown()
    {
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * HELPER METHODS 
     *
     */
    // This Method Sets up a Mocked Array of Rooms
    // Each room's description is it's room number (location in array + 1)
    private Room[] returnRoomArray( int numberOfRooms )
    {
        Room[] r = new Room[numberOfRooms];

        for (int i = 0; i < r.length; i ++)
        {
            r[i] = mock(Room.class);
            when(r[i].getDescription()).thenReturn(Integer.toString(i+1));
        }

        return r;
    }

    // This Method Assumes that the House's current room is the first room
    private void moveToRoomViaNorth(int roomNumber)
    {
        for (int i = 1; i < roomNumber; i++)
        {
            h.moveNorth();
        }
    }

    // This Method Assumes that the House's current room is the last room
    private void moveToRoomViaSouth(int roomNumber, int maxRooms)
    {
        for (int i = maxRooms; i > roomNumber; i--)
        {
            h.moveSouth();
        }
    }

    /**
     * The Following Tests test House.getCurrentRoomInfo() for each room
     * by moving North 
     *
     * The Number of Rooms in the House being tested is 6 
     *
     * SIDE NOTE: These tests are also implicitly testing House.moveNorth()
     */
    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 1
    - To Pass:      Method returns "1"
    - Expected Output:  "1"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R1_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        assertEquals("1",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 2
    - Tests uses h.moveNorth() to move to the proper room
    - To Pass:      Method returns "2"
    - Expected Output:  "2"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R2_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(2);
        assertEquals("2",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 3
    - Tests uses h.moveNorth() to move proper room
    - To Pass:      Method returns "3"
    - Expected Output:  "3"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R3_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(3);
        assertEquals("3",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 4
    - Tests uses h.moveNorth() to move proper room
    - To Pass:      Method returns "4"
    - Expected Output:  "4"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R4_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(4);
        assertEquals("4",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 5
    - Tests uses h.moveNorth() to move proper room
    - To Pass:      Method returns "5"
    - Expected Output:  "5"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R5_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(5);
        assertEquals("5",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() to make sure the method is returning the correct
        description for room 6
    - Tests uses h.moveNorth() to move proper room
    - To Pass:      Method returns "6"
    - Expected Output:  "6"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R6_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        assertEquals("6",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info after try to move North
        when there is no Northern door
    - Tests uses h.moveNorth() to move proper room
    - To Pass:      Method returns "6"
    - Expected Output:  "6"
     */
    @Test
    public void test_getCurrentRoomInfo_6_TestNoNorthDoor_MovingNorth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(7);
        assertEquals("6",h.getCurrentRoomInfo());
    }

    /**
     * The Following Tests test House.getCurrentRoomInfo() for each room
     * by moving South
     *
     * The Number of Rooms in the House being tested is 6
     *
     * SIDE NOTE: These tests are also implicitly testing House.moveNorth() because I have to
     *      use House.moveNorth() in order to move South
     *      This Test is also implicitly testing House.moveSouth()
     */
    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info for room 5
    - This test uses h.moveNorth() to first get to the last room
    - Tests uses h.moveSouth() to move proper room
    - To Pass:      Method returns "5"
    - Expected Output:  "5"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R5_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        moveToRoomViaSouth(5, 6);
        assertEquals("5",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info for room 4
    - This test uses h.moveNorth() to first get to the last room
    - Tests uses h.moveSouth() to move proper room
    - To Pass:      Method returns "4"
    - Expected Output:  "4"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R4_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        moveToRoomViaSouth(4, 6);
        assertEquals("4",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info for room 3
    - This test uses h.moveNorth() to first get to the last room
    - Tests uses h.moveSouth() to move proper room
    - To Pass:      Method returns "3"
    - Expected Output:  "3"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R3_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        moveToRoomViaSouth(3, 6);
        assertEquals("3",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info for room 2
    - This test uses h.moveNorth() to first get to the last room
    - Tests uses h.moveSouth() to move proper room
    - To Pass:      Method returns "2"
    - Expected Output:  "2"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R2_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        moveToRoomViaSouth(2, 6);
        assertEquals("2",h.getCurrentRoomInfo());
    }

    /*
    - Test House.getCurrentRoomInfo() is returning the correct room info for room 1
    - This test uses h.moveNorth() to first get to the last room
    - Tests uses h.moveSouth() to move proper room
    - To Pass:      Method returns "1
    - Expected Output:  "1"
     */
    @Test
    public void test_getCurrentRoomInfo_6_R1_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        moveToRoomViaSouth(1, 6);
        assertEquals("1",h.getCurrentRoomInfo());
    }

    /*
    - Tests House.getCurrentRoomInfo() by making sure that is still returns room 1's info
        after trying to move South from Room 1
    - To Pass:      Method returns "1"
    - Expected Output:  "1"
     */
    @Test
    public void test_getCurrentRoomInfo_6_TestNoSouthDoor_MovingSouth()
    {
        h = new House(returnRoomArray(6));
        h.moveSouth();
        assertEquals("1",h.getCurrentRoomInfo());
    }

    /**
     * Following Tests test House.generateRooms()
     * These Focus on the Returned Array Size
     */
    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure
            it is created the proper amount of rooms
    - Make an array of length 0
    - To Pass:      Array Length is 0
    - Expected Output:  r.length == 0
     */
    @Test
    public void test_generateRooms_0_size()
    {
        h = new House(0);
        Room[] r = h.generateRooms(0);
        assertEquals(0, r.length);
    }

    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure
            it is created the proper amount of rooms
    - Make an array of length 1
    - To Pass:      Array Length is 1
    - Expected Output:  r.length == 1
     */
    @Test
    public void test_generateRooms_1_size()
    {
        h = new House(1);
        Room[] r = h.generateRooms(1);
        assertEquals(1, r.length);
    }

    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure
            it is created the proper amount of rooms
    - Make an array of length 3
    - To Pass:      Array Length is 3
    - Expected Output:  r.length == 3
     */
    @Test
    public void test_generateRooms_3_size()
    {
        h = new House(3);
        Room[] r = h.generateRooms(3);
        assertEquals(3, r.length);
    }

    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure
            it is created the proper amount of rooms
    - Make an array of length 6
    - To Pass:      Array Length is 6
    - Expected Output:  r.length == 6
     */
    @Test
    public void test_generateRooms_6_size()
    {
        h = new House(6);
        Room[] r = h.generateRooms(6);
        assertEquals(6, r.length);
    }

    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure
            it is created the proper amount of rooms
    - Make an array of length 25
    - To Pass:      Array Length is 25
    - Expected Output:  r.length == 25
     */
    @Test
    public void test_generateRooms_25_size()
    {
        h = new House(25);
        Room[] r = h.generateRooms(25);
        assertEquals(25, r.length);
    }

    /*
    - Tests House.generateRooms() by testing the Room Array Size to make sure 
            it is created the proper amount of rooms
    - Make an array of length 500
    - To Pass:      Array Length is 500
    - Expected Output:  r.length == 500
     */
    @Test
    public void test_generateRooms_500_size()
    {
        h = new House(500);
        Room[] r = h.generateRooms(500);
        assertEquals(500, r.length);
    }

    /*
    - Tests House.look() to see if player collects coffee when the room contains coffee
    - To pass:          Player has coffee after looking in room
    - Expected output:  p.hasCoffee() == true
     */
    @Test
    public void test_look_GetCoffee()
    {
        Room r = new Room(true, false, false, false, false);
        Player p = new Player(false, false, false);

        House h = new House(1);

        assertFalse(p.hasCoffee());
        h.look(p, r);
        assertTrue(p.hasCoffee());
    }

    /*
    - Tests House.look() to see if player collects cream when the room contains cream
    - To pass:          Player has cream after looking in room
    - Expected output:  p.hasCream() == true
     */
    @Test
    public void test_look_GetCream()
    {
        Room r = new Room(false, true, false, false, false);
        Player p = new Player(false, false, false);

        House h = new House(1);

        assertFalse(p.hasCream());
        h.look(p, r);
        assertTrue(p.hasCream());
    }

    /*
    - Tests House.look() to see if player collects sugar when the room contains Sugar
    - To pass:          Player has sugar after looking in room
    - Expected output:  p.hasSugar() == true 
     */
    @Test
    public void test_look_GetSugar()
    {
        Room r = new Room(false, false, true, false, false);
        Player p = new Player(false, false, false);

        House h = new House(1);

        assertFalse(p.hasSugar());
        h.look(p, r);
        assertTrue(p.hasSugar());
    }

    /*
    - Tests House.look() when the room has no items
    - To pass:          A message saying "You don't see anything out of the ordinary." prints out
    - Expected output:  outContent.toString() == "You don't see anything out of the ordinary.\r\n"
     */
    @Test
    public void test_look_NoItems()
    {
        Room r = new Room(false, false, false, false, false);

        House h = new House(1);

        h.look(null, r);
        assertEquals(outContent.toString(), "You don't see anything out of the ordinary.\r\n");
    }

    /*
    - Tests House.look() when no room is passed to it, it
        should default to the current room
    - To pass:      Player has coffee after looking into room, even though
                        room was unspecified
    - Expected output:  p.HasCoffee() == true
     */
    @Test
    public void test_look_WithoutRoom()
    {
        Room r = new Room(true, false, false, false, false);
        House h = new House(new Room[] {r});
        Player p = new Player(false, false, false);

        h.look(p, null);
        assertTrue(p.hasCoffee());
    }

    /**
     * NEW TESTS!
     *
     * The following tests to make sure that House.moveNorth() is Working by checking to make
     * sure that _CurrentRoom is properly getting set. moveNorth() returns its value.
     *
     * The Number of Rooms in the House being tested is 6
     * moveToRoomViaNorth(int roomNumber) helper method is used
     *
     */
    /*
    - Tests House.moveNorth() when moving from the first room to the second room
    - To pass:      h.moveNorth() returns 1
    - Expected output:  1
     */
    @Test
    public void test_moveNorth_0_to_1()
    {
        h = new House(returnRoomArray(6));
        assertEquals(1, h.moveNorth());
    }

    /*
    - Tests House.moveNorth() when moving from the second room to the third room
    - To pass:      h.moveNorth() returns 2
    - Expected output:  2
     */
    @Test
    public void test_moveNorth_1_to_2()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(2);
        assertEquals(2, h.moveNorth());
    }

    /*
    - Tests House.moveNorth() when moving from the third room to the fourth room
    - To pass:      h.moveNorth() returns 3
    - Expected output:  3
     */
    @Test
    public void test_moveNorth_2_to_3()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(3);
        assertEquals(3, h.moveNorth());
    }

    /*
    - Tests House.moveNorth() when moving from the fourth room to the fifth room
    - To pass:      h.moveNorth() returns 4
    - Expected output:  4
     */
    @Test
    public void test_moveNorth_3_to_4()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(4);
        assertEquals(4, h.moveNorth());
    }

    /*
    - Tests House.moveNorth() when moving from the fifth room to the last room
    - To pass:      h.moveNorth() returns 5
    - Expected output:  5
     */
    @Test
    public void test_moveNorth_4_to_5()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(5);
        assertEquals(5, h.moveNorth());
    }

    /**
     * NEW TESTS!
     *
     * The following tests to make sure that House.moveSouth() is Working
     *
     * The Number of Rooms in the House being tested is 6
     * moveToRoomViaNorth(int roomNumber) helper method is used
     *
     */
    /*
    - Tests House.moveSouth() when moving from the last room to the fifth room
    - To pass:      h.moveSouth() returns 4
    - Expected output:  4
     */
    @Test
    public void test_moveSouth_5_to_4()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(6);
        assertEquals(4, h.moveSouth());
    }

    /*
    - Tests House.moveSouth() when moving from the fifth room to the fourth room
    - To pass:      h.moveSouth() returns 3
    - Expected output:  3
     */
    @Test
    public void test_moveSouth_4_to_3()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(5);
        assertEquals(3, h.moveSouth());
    }

    /*
    - Tests House.moveSouth() when moving from the fifth room to the third room
    - To pass:      h.moveSouth() returns 2
    - Expected output:  2
     */
    @Test
    public void test_moveSouth_3_to_2()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(4);
        assertEquals(2, h.moveSouth());
    }

    /*
    - Tests House.moveSouth() when moving from the third room to the second room
    - To pass:      h.moveSouth() returns 1
    - Expected output:  1
     */
    @Test
    public void test_moveSouth_2_to_1()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(3);
        assertEquals(1, h.moveSouth());
    }

    /*
    - Tests House.moveSouth() when moving from the second room to the first room
    - To pass:      h.moveSouth() returns 0
    - Expected output:  0
     */
    @Test
    public void test_moveSouth_1_to_0()
    {
        h = new House(returnRoomArray(6));
        moveToRoomViaNorth(2);
        assertEquals(0, h.moveSouth());
    }

    /**
     * NEW TESTS!
     *
     * The following tests to make sure that House.look() is working by taking a look at the new return value
     *
     * The Number of Rooms in the House being tested is 6
     * moveToRoomViaNorth(int roomNumber) helper method is used
     *
     */
    /*
    - Test to make sure that House.look() does not find an item in a room that has no items
    - Uses a mocked version of player and room
    -
    - To Pass: House.look() returns 0
    - Expected Output: 0
     */
    @Test
    public void test_look_NoItems_ReturnValue()
    {
        Room r = mock(Room.class);
        Player p = mock(Player.class);
        when(r.hasItem()).thenReturn(false);

        House h = new House(6);

        assertEquals(0, h.look(p, r));
    }

    /*
    - Test to make sure that House.look() finds coffee in a room that contains coffee
    - Uses a mocked version of player and room
    -
    - To Pass: House.look() returns 1
    - Expected Output: 1
     */
    @Test
    public void test_look_Coffee_ReturnValue()
    {
        Room r = mock(Room.class);
        Player p = mock(Player.class);
        when(r.hasItem()).thenReturn(true);
        when(r.hasCoffee()).thenReturn(true);
        when(r.hasCream()).thenReturn(false);
        when(r.hasSugar()).thenReturn(false);

        House h = new House(6);

        assertEquals(1, h.look(p, r));
    }

    /*
    - Test to make sure that House.look() finds cream in a room that contains cream
    - Uses a mocked version of player and room
    -
    - To Pass: House.look() returns 2
    - Expected Output: 2
     */
    @Test
    public void test_look_Cream_ReturnValue()
    {
        Room r = mock(Room.class);
        Player p = mock(Player.class);
        when(r.hasItem()).thenReturn(true);
        when(r.hasCoffee()).thenReturn(false);
        when(r.hasCream()).thenReturn(true);
        when(r.hasSugar()).thenReturn(false);

        House h = new House(6);

        assertEquals(2, h.look(p, r));
    }

    /*
    - Test to make sure that House.look() finds sugar in a room that contains sugar
    - Uses a mocked version of player and room
    -
    - To Pass: House.look() returns 3
    - Expected Output: 3
     */
    @Test
    public void test_look_Sugar_ReturnValue()
    {
        Room r = mock(Room.class);
        Player p = mock(Player.class);
        when(r.hasItem()).thenReturn(true);
        when(r.hasCoffee()).thenReturn(false);
        when(r.hasCream()).thenReturn(false);
        when(r.hasSugar()).thenReturn(true);

        House h = new House(6);

        assertEquals(3, h.look(p, r));
    }
}
