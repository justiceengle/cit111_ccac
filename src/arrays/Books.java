/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author justice.engle
 */
public class Books {
    public static void main(String[] args) {
        String[] books = new String[6];
        
        String book1 = "Perl Cookbook";
        String book2 = "PHP Cookbook";
        String book3 = "Python In a Nutshell";
        String book4 = "Javascript: The Definitive Guide";
        String book5 = "Java In a Nutshell";
        
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        
        printArrayContents(books);
    } // close main method
    
    
    public static void printArrayContents(String[] string) {
        for(int i = 0; i < string.length; i++) {
            System.out.println("Value of Book " + (i + 1) + ": " + string[i]);
        }
    }
    
    
} // close class
