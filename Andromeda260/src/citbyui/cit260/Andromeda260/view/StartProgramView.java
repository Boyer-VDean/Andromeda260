/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.model.Player;
import java.util.Scanner;

/**
 *
 * @author reyob
 */
public class StartProgramView {
    
    public StartProgramView(){
    }
    public void startProgram(){

        //Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name, retrieve the name of the player
        String playerName = this.getPlayersName();
        
        //Create and save the player object
        Player player = GameControl.createPlayer(playerName);
        
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);

        //DISPLAY the main menu

        //END


    }

    private void displayBanner() {
        System.out.println("\n\n***************************************");
        
        System.out.println("*                                      *"
                       + "\n* This is the game of Andromeda        *"
                       + "\n* In this game you will travel the     *"
                       + "\n* stars as captain of the starship     *"
                       + "\n* Butterfinger.                        *");
        
        System.out.println("*                                      *"
                        + "\n You and your crew will travel to     *"
                        + "\n different planets and battle aliens  *"
                        + "\n as you try to find a new home for    *"
                        + "\n humans.                              *");
        
        System.out.println("*                                      *"
                        + "\n Good luck and may the odds be ever   *"
                        + "\n in your favor.                       *");
        
        System.out.println("*****************************************");
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid){ // while a valid name hasnot been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the lanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two character in length)
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n====================================");
        System.out.println("\nWelcome to the game " + player.getName());
        System.out.println("\nWe hope you have a lot of fun!");
        System.out.println("\n====================================");
    }
}