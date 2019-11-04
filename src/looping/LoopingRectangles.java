
package looping;

import java.util.Scanner;

public class LoopingRectangles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How tall should the triangle be?");
        int height = reader.nextInt();
        int heightCount = 1;
        int stars = 1;
        
        while(heightCount <= height) {
            int spaces = height - heightCount;
            
            for(int number = 0; number < spaces; number++) {
                System.out.print(" ");
            }
            for(int numStars = 0; numStars < stars; numStars++){
                System.out.print("*");
            }
            for(int number = 0; number < spaces; number++) {
                System.out.print(" ");
            }
            
            heightCount++;
            stars += 2;
            System.out.println("");
            
        }
    }
}
