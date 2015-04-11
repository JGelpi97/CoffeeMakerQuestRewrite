package com.laboon;

public class House
{

    private int _numRooms = 6;

    private Room[] _rooms = new Room[_numRooms];

    private int _currentRoom = 0;

    public House(int numRooms)
    {
        _numRooms = numRooms;
        _rooms = generateRooms(_numRooms);
    }

    public House(Room[] rooms)
    {
        _numRooms = rooms.length;
        _rooms = rooms;
    }

    public String getCurrentRoomInfo()
    {
        return _rooms[_currentRoom].getDescription();
    }

    public void moveNorth()
    {
        if (_currentRoom == (_numRooms - 1))    //currentRoom starts at 0
        {
            System.out.println("You cannot go North any further!");
        }
        else
        {
            _currentRoom += 1;
        }
    }

    public void moveSouth()
    {
        if (_currentRoom == 0)
        {
            System.out.println("You cannot go South any further!");
        }
        else
        {
            _currentRoom -= 1;
        }
    }

    public void look(Player player, Room room)
    {
        if (room == null)
        {
            room = _rooms[_currentRoom];
        }
        if (room.hasItem())
        {
            System.out.println("There might be something here...");
            if (room.hasCoffee())
            {
                player.getCoffee();
            }
            if (room.hasCream())
            {
                player.getCream();
            }
            if (room.hasSugar())
            {
                player.getSugar();
            }
        }
        else
        {
            System.out.println("You don't see anything out of the ordinary.");
        }
    }

    public Room[] generateRooms(int numRooms)
    {

        Room[] toReturn = new Room[numRooms];

        boolean northDoor = true;
        boolean southDoor = true;
        boolean hasCoffee = false;
        boolean hasCream = false;
        boolean hasSugar = false;

        for (int j = 0; j < numRooms; j++)
        {

            if (j == 0)
            {
                hasCream = true;
            }

            if (j == 2)
            {
                hasCoffee = true;
            }

            if (j == (numRooms - 1))
            {
                hasSugar = true;
            }

            if (j == 0)
            {
                southDoor = false;
            }

            if (j == (numRooms - 1))
            {
                northDoor = false;
            }

            toReturn[j] = new Room(hasCoffee, hasCream, hasSugar, northDoor, southDoor);

            northDoor = true;
            southDoor = true;
            hasCoffee = false;
            hasCream = false;
            hasSugar = false;
        }

        return toReturn;
    }

}
