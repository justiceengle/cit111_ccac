package looping;

import java.util.Scanner;

public class WhileWithScanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numberOfLoops = 0;
        int loopControl;
        
        System.out.println("How many loops shall I print?");
        loopControl = reader.nextInt();
        
        while(numberOfLoops <= loopControl) {
            System.out.println("The value of loops: " + numberOfLoops);
            numberOfLoops++;
        }
        
        System.out.println("... after the loop.");
    }
}
