package hilogame;

import java.lang.Math;
import java.util.*;
public class HiLoGame {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, guess, guessCount;
        boolean playAgain = true;
        
        while (playAgain) { //prompt user to enter a value
            guessCount = 0;
            num = (int) (Math.random() * 100) + 1;
            System.out.println("Welcome to the Hi-Lo Game! "
                + "Try to guess a number between 1 and 100."
                + " \nEnter your number:");
            
            guess = scan.nextInt();
            
            while (guess != 0) { //while loop to keep the code going until prompted to quit
            
                if (num == guess) { //displays messages
                    System.out.println("You guessed the correct answer!");
                    guessCount++;
                    System.out.println("Number of guesses: " + guessCount);
                    guess = 0;
                }
                else {
                    if (num > guess) {
                        System.out.println("Your guess is too low. \nGuess again (0 to quit):");
                        guess = scan.nextInt();
                        scan.nextLine();
                        guessCount++;
                    }
                    else {
                        System.out.println("Your guess is too high. \nGuess again (0 to quit):");
                        guess = scan.nextInt();
                        scan.nextLine();
                        guessCount++;
                    }
                }
            }
            
            System.out.println("Would you like to play again? (y/n)");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("n")) {
                playAgain = false;
            }
            
        }  
    }
    
}
