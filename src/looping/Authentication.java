/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "p@$$w0rd";
        final int attempts = 3;
        int incorrectGuesses = 0;
        
        while(incorrectGuesses < attempts) {
            System.out.print("Please enter password: ");
            String key = reader.nextLine();
            
            if(key.equals(password)) {
                System.out.println("");
                System.out.println("The treasure is buried under the apple tree!");
                break;
            }
            incorrectGuesses++;
            
            if(incorrectGuesses >= attempts) {
                System.out.println("Too many incorrect attempts. Have a nice day!");
                break;
            }
            
            System.out.println("Incorrect password, please try again.");
            System.out.println("Number of attempts: " + incorrectGuesses);
            System.out.println("Attemps remaining: " + (attempts - incorrectGuesses));
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Thank you for participating!");
        
    }
}
