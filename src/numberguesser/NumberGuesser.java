package numberguesser;

import java.util.Scanner;

public class NumberGuesser {
    int lowerBound;
    int upperBound;
    int numberOfGuesses;
    Scanner reader;
    int average;
    
    
    public NumberGuesser(int number) {
        upperBound = number;
        lowerBound = 1;
        numberOfGuesses = (int) ((Math.log(number) / Math.log(2)) + 1);
        reader = new Scanner(System.in);
    }
    
    public void greeting() {
        System.out.println("**********");
        System.out.println("Welcome to the Number Guesser! I will guess the number"
                + " between 1 and " + upperBound + " that you are thinking in " + (numberOfGuesses) + " questions!");
        System.out.println("Let's begin!");
        System.out.println("**********");
    }
    
    public void numberLogic() {
        int response;
        while(true) {
            if(upperBound == lowerBound) {
                break;
            }
            
            average = (upperBound + lowerBound) / 2;
            
            System.out.println("Is your number greater than " + average + "?");
            System.out.println("Type 1 for 'yes', 2 for 'no'.");
            response = reader.nextInt();
            
            answerLogic(response);
            System.out.println("");
        }
        
        System.out.println("Your number is " + upperBound + ".");
        
    }
    
    public void answerLogic(int answer) {
        int response = answer;
        String invalidResponse = "INVALID RESPONSE - PLEASE ENTER EITHER 1"
                + " FOR 'YES' OR 2 FOR 'NO'";
        
        if(response == 1) {
            lowerBound = average + 1;
        } else if(answer == 2) {
            upperBound = average;
        } else {
            System.out.println("");
            System.out.println(invalidResponse);
        }
    }
}
