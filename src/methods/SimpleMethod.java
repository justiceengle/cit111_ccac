package methods;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class SimpleMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("***** switches and methods *****");
        System.out.println("");
        System.out.println("Options:");
        System.out.println("1 - print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here");
        System.out.println("");
        System.out.println("Enter an integer and press enter:");
        
        final int COMMAND = reader.nextInt();
        
        System.out.println("");
        
        switch(COMMAND) {
            case 1:
                printStatement();
                break;
            case 2:
                printBigRandomNumber();
                break;
            case 3:
                System.out.println("Have a nice day!");
                break;
                
        }
    }
    
    public static void printStatement() {
        System.out.println("SPECICAL STATEMENT:");
        System.out.println("When there's a will, there's a way!");
    }
    
    public static void printBigRandomNumber() {
        Random r = new Random();
        BigInteger number = new BigInteger(100, r);
        
        System.out.println("BIG RANDOM NUMBER:");
        System.out.println(number);
    }
}
