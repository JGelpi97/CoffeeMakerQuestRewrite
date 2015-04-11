package com.laboon;

public class Game
{

    private Player _player = null;
    public House _house = null;

    public Game(Player p, House h)
    {
        _player = p;
        _house = h;
    }

    /**
     * Changed to handleInput from doSomething
     *
     * @param move Keyboard input
     * @return int for game logic
     */
    public int handleInput(String move)
    {
        int toReturn = 0;
        if (move.equalsIgnoreCase("N"))
        {
            _house.moveNorth();
        }
        else if (move.equalsIgnoreCase("S"))
        {
            _house.moveSouth();
        }
        else if (move.equalsIgnoreCase("L"))
        {
            _house.look(_player, null);
        }
        else if (move.equalsIgnoreCase("I"))
        {
            _player.showInventory();
        }
        else if (move.equalsIgnoreCase("D"))
        {
            boolean finalStatus = _player.drink();
            if (finalStatus)
            {
                toReturn = 1;
            }
            else
            {
                toReturn = -1;
            }
        }
        else if (move.equalsIgnoreCase("H"))
        {
            System.out.println("Instructions for Coffee Maker Quest - ");
            System.out.println("You are a brave student trying to study for finals, but you need caffeine.");
            System.out.println("The goal of the game is to collect sugar, coffee, and cream so that you can study.");
            System.out.println("Valid commmands are:");
            System.out.println(" N - Move North");
            System.out.println(" S - Move South");
            System.out.println(" L - Look around room");
            System.out.println(" I - Show inventory");
            System.out.println(" D - Drink to to win game");
        }
        else
        {
            System.out.println("What?");
        }
        return toReturn;
    }

    /**
     * Refactored to Allow Testing
     * Scanner and main loop is moved to CoffeeMake.runGameLoop()
     * Returns 1 for win, -1 for loss, 0 for standard move
     *
     * @param move String
     * @return 1 for win, -1 for lose, 0 for normal play
     */
    public int run(String move)
    {
        return handleInput(move);
    }

}
