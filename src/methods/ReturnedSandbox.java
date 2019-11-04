/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author justice.engle
 */
public class ReturnedSandbox {
    public static void main(String[] args) {
        String word = "testing";
        
        String choppedWord = chopCharactersFromString(word);
        
        System.out.println("Chopped word: " + choppedWord);
    }
    
    public static String chopCharactersFromString(String string) {
        String stringToChop;
        
        int inputStringLength = string.length();
        
        if(inputStringLength < 4) {
            return "Too short!";
        }
        
        stringToChop = string.substring(2, inputStringLength);
        
        return stringToChop;
    }
    
}
