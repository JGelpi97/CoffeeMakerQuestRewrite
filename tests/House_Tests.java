import com.laboon.House;
import com.laboon.Room;
import org.junit.Test;

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
    
}
