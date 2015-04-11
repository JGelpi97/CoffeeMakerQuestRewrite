package tests;

import com.laboon.Game;
import com.laboon.House;
import com.laboon.Player;
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
 * This contains junit tests for Game.java
 *  
 */

public class Game_Tests 
{
    Game g;
    House h;
    Player p;

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
        h = mock(House.class);
        p = mock(Player.class);
        g = new Game(p ,h);

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
     * Following Tests Check to Make sure that Case-insensitivity requirement is working 
     * REQUIREMENT: FUN-INPUT-CAPS
     * NOTE:        In order to tell Case-insensitivity, look for "What?" 
     */
    /*
    - Test Game.handleInput() to make sure upper case 'N' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_N() 
    {
        g.handleInput("N");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 'n' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_n()
    {
        g.handleInput("n");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput()to make sure upper case 'S' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_S()
    {
        g.handleInput("S");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 's' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_s()
    {
        g.handleInput("s");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure upper case 'L' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_L()
    {
        g.handleInput("L");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 'l' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_l()
    {
        g.handleInput("l");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure upper case 'I' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_I()
    {
        g.handleInput("I");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 'i' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_i()
    {
        g.handleInput("i");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure upper case 'H' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_H()
    {
        g.handleInput("H");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 'h' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_h()
    {
        g.handleInput("h");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure upper case 'D' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_D()
    {
        g.handleInput("D");
        assertFalse(outContent.toString().contains("What?"));
    }

    /*
    - Test Game.handleInput() to make sure lower case 'd' is a valid command
    - To Pass:      Method does not print "What?", which means it is a valid command
    - Expected Output:  the method does not print "What?"
     */
    @Test
    public void testhandleInput_d()
    {
        g.handleInput("d");
        assertFalse(outContent.toString().contains("What?"));
    }

    /**
     * Following Tests check the return value of Valid Input
     * Should Be Zero to since the inputs N,S,I,L,H do not end the game 
     */
    /*
    - Test Game.handleInput() to make sure a input of 'N' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_N_ReturnValue() {
        assertEquals(0, g.handleInput("N"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'n' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_n_ReturnValue()
    {
        assertEquals(0, g.handleInput("n"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'S' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_S_ReturnValue()
    {
        assertEquals(0, g.handleInput("S"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 's' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_s_ReturnValue()
    {
        assertEquals(0, g.handleInput("s"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'L' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_L_ReturnValue()
    {
        assertEquals(0, g.handleInput("L"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'l' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_l_ReturnValue()
    {
        assertEquals(0, g.handleInput("l"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'I' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_I_ReturnValue()
    {
        assertEquals(0, g.handleInput("I"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'i' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_i_ReturnValue()
    {
        assertEquals(0, g.handleInput("i"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'H' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_H_ReturnValue()
    {
        assertEquals(0, g.handleInput("H"));
    }

    /*
    - Test Game.handleInput() to make sure a input of 'h' returns 0
    - A return value of 0 means that the game will still run
    - To Pass:  Method returns 0
    - Expected Output:  0
     */
    @Test
    public void testhandleInput_h_ReturnValue()
    {
        assertEquals(0, g.handleInput("h"));
    }

    /**
     * Following Tests check the drink command's return value
     * For Game win, drink returns 1
     * For Game lose, drink returns -1
     */
    /*
    - Test Game.handleInput() to Make sure the Method Returns -1 when the player inventory does
        not contain all of the need items
    - Uses Mockito to cause the player.drink() method to return false ( invalid win condition )
    - A return value of -1 will cause a game over with a loss
    - Input: upper case 'D'
    - To Pass:  Method returns -1
    - Expected Output:  -1
     */
    @Test
    public void testhandleInput_D_InvalidInventory()
    {
        when(p.drink()).thenReturn(false);
        assertEquals(-1, g.handleInput("D"));
    }

    /*
    - Test Game.handleInput() to Make sure the Method Returns 1 when the player inventory does
        contain all of the need items
    - Uses Mockito to cause the player.drink() method to return true ( valid win condition )
    - A return value of 1 will cause a game over with a win
    - Input: upper case 'D'
    - To Pass:  Method returns 1
    - Expected Output:  1
     */
    @Test
    public void testhandleInput_D_ValidInventory()
    {
        when(p.drink()).thenReturn(true);
        assertEquals(1, g.handleInput("D"));
    }

    /*
    - Test Game.handleInput() to Make sure the Method Returns -1 when the player inventory does
        not contain all of the need items
    - Uses Mockito to cause the player.drink() method to return false ( invalid win condition )
    - A return value of -1 will cause a game over with a loss
    - Input: lower case 'd'
    - To Pass:  Method returns -1
    - Expected Output:  -1
     */
    @Test
    public void testhandleInput_d_InvalidInventory()
    {
        when(p.drink()).thenReturn(false);
        assertEquals(-1, g.handleInput("d"));
    }

    /*
    - Test Game.handleInput() to Make sure the Method Returns 1 when the player inventory does
        contain all of the need items
    - Uses Mockito to cause the player.drink() method to return true ( valid win condition )
    - A return value of 1 will cause a game over with a win
    - Input: lower case 'd'
    - To Pass:  Method returns 1
    - Expected Output:  1
     */
    @Test
    public void testhandleInput_d_ValidInventory()
    {
        when(p.drink()).thenReturn(true);
        assertEquals(1, g.handleInput("d"));
    }

    /**
     * Following Tests make sure non-valid inputs are printing "What?"
     * This means that invalid inputs are being handled properly
     */
    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    upper case 'Q'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_Q()
    {
        g.handleInput("Q");
        assertTrue(outContent.toString().contains("What?"));
    }

    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    lower case 'q'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_q()
    {
        g.handleInput("q");
        assertTrue(outContent.toString().contains("What?"));
    }

    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    upper case 'P'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_P()
    {
        g.handleInput("P");
        assertTrue(outContent.toString().contains("What?"));
    }

    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    lower case 'p'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_p()
    {
        g.handleInput("p");
        assertTrue(outContent.toString().contains("What?"));
    }

    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    upper case 'C'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_C()
    {
        g.handleInput("C");
        assertTrue(outContent.toString().contains("What?"));
    }

    /*
    - Tests Game.handleInput() to make sure it properly handles invalid inputs
    - Input:    lower case 'c'
    - To Pass:  Method will print out "What?"
    - Expected Output:  Method prints "What?"
     */
    @Test
    public void testhandleInput_c()
    {
        g.handleInput("c");
        assertTrue(outContent.toString().contains("What?"));
    }

    /**
     * Following Tests Test the Run Method
     * NOTE: Due to the Scanner in the Run Method, this method cannot be tested and will fail
     * Fails as a reminder that I could go back and refactor the code so this method can be properly tested
     */
    /*
    - Test To see if Game.run() properly wins the game
    - Uses Mockito to mock Player.drink() to return true which will cause the game to win
    - To Pass:  Run Method returns 0
    - Expected Output:  Method prints 0
     */
    @Test
    public void testRun_GameWin()
    {
        fail("NOTE: Do to the Scanner in the method, this method is unable to be tested");
//        when(p.drink()).thenReturn(true);
//        assertEquals(0, g.run());
    }

    /*
    - Test To see if Game.run() properly loses the game
    - Uses Mockito to mock Player.drink() to return false which will cause the game to lose
    - To Pass:  Run Method returns 1
    - Expected Output:  1
     */
    @Test
    public void testRun_GameLose()
    {
        fail("NOTE: Do to the Scanner in the method, this method is unable to be tested");
//        when(p.drink()).thenReturn(false);
//        assertEquals(1, g.run());
    }
}
