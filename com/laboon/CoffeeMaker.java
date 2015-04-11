package com.laboon;

import java.util.Scanner;

public class CoffeeMaker
{

    /*
    - Removed Player and House from parameters - YAGNI Principle
     */
    private int runGameLoop(Game g)
    {
        int toReturn;
        String move;

        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        boolean win = false;

        while (!gameOver)
        {
            System.out.println(g._house.getCurrentRoomInfo());
            System.out.println(" INSTRUCTIONS (N,S,L,I,D,H) > ");
            move = in.nextLine();
            int status = g.run(move);
            if (status == 1)
            {
                gameOver = true;
                win = true;
            }
            else if (status == -1)
            {
                gameOver = true;
                win = false;
            }
        }

        if (win)
        {
            System.out.println("You win!");
            toReturn = 0;
        }
        else
        {
            System.out.println("You lose!");
            toReturn = 1;
        }

        return toReturn;
    }

    /*
    - Removed Args from parameters since arg was not being used - YAGNI Principle
     */
    public int runArgs()
    {
        System.out.println("Instructions for Coffee Maker Quest - ");
        System.out.println("You are a brave student trying to study for finals, but you need caffeine.");
        System.out.println("The goal of the game is to collect sugar, coffee, and cream so that you can study.");
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println("Coffee Maker Quest 1.0");
        int returnValue = 0;
        CoffeeMaker cm = new CoffeeMaker();
        if (args.length == 0)
        {
            Player p = new Player();
            House h = new House(6);
            Game g = new Game(p, h);
            returnValue = cm.runGameLoop(g);
        }
        else
        {
            returnValue = cm.runArgs();
        }

        System.out.println("Exiting with error code " + returnValue);
    }

}
