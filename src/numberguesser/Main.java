/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguesser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("I am going to guess a number between 1 and some"
                + " other number.");
        System.out.println("Please type the upper-bound number and press enter (no commas).");
        
        int upperBound = reader.nextInt();
        
        System.out.println("");
        
        NumberGuesser numberGuesser = new NumberGuesser(upperBound);
        
        numberGuesser.greeting();
        
        System.out.println("");
        
        numberGuesser.numberLogic();
    }
}
