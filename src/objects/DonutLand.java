/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;


import java.util.Scanner;
/**
 *
 * @author justice.engle
 */
public class DonutLand {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("What is the name of the donut?");
        String name = reader.nextLine();
        System.out.println("What flavor is the donut?");
        String flavor = reader.nextLine();
        System.out.println("How many calories does the donut have?");
        int calories = reader.nextInt();
        
        Donut donut = new Donut(name, flavor, calories);
        
        donut.eatDonut();
        
        donut.printStats();
        
        donut.eatDonut();
        
        donut.printStats();
        
        donut.eatDonut();
        
        
    }
}
