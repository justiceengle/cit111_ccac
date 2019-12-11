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
public class IntegerArray {
    public static void main(String[] args) {
        int[] writingInstruments = new int[5];
        writingInstruments[0] = 15;
        writingInstruments[1] = 19;
        writingInstruments[2] = 5;
        writingInstruments[3] = 16;
        writingInstruments[4] = 14;
        
        printNumberArrayManually(writingInstruments);
        System.out.println("Sum of the Array: " + computeSum(writingInstruments));
        System.out.println("Average Count in Each Beaker: " + average(writingInstruments));
        
    } // close main method

    public static void printNumberArrayManually(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Value of Beaker #" + (i + 1) + ": " + array[i]);
        }
    } // close method
    
    public static double computeSum(int[] array) {
        int sum = 0;
        int counter = 0;
        
        while(counter < array.length) {
            sum = sum + array[counter];
            counter++;
        }
        
        return sum;
        
    } // close method
    
    public static double average(int[] array) {
        return computeSum(array)/array.length;
    }
    
} // close class
