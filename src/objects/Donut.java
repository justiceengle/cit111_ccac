/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

public class Donut {
    public String name;
    public String flavor;
    public int calories;
    public int percentRemaining;
    public boolean sprinkles;
    public boolean glazed;
    Scanner reader;
    
    public Donut(String name, String flavor, int calories) {
        this.name = name;
        this.flavor = flavor;
        this.calories = calories;
        this.percentRemaining = 100;
        this.reader = new Scanner(System.in);
    }
    
    public void eatDonut() {
        while(true) {
            if(this.percentRemaining == 0) {
            System.out.println("ERROR! THERE IS NO DONUT TO EAT!");
            break;
            }
            
            while(true) {
            System.out.println("Are taking a 'big' bite out of the donut, a 'medium' bite"
                + " or a 'small' bite?");
            String answer = reader.nextLine();
            answer.trim();
            answer.toLowerCase();
        
            if(answer.equals("big")) {
                this.percentRemaining -= 50;
                if(this.percentRemaining < 0) {
                    this.percentRemaining = 0;
                }
                break;
            } else if(answer.equals("medium")) {
                this.percentRemaining -= 25;
                if(this.percentRemaining < 0) {
                    this.percentRemaining = 0;
                }
                break;
            } else if(answer.equals("small")) {
                this.percentRemaining -= 15;
                if(this.percentRemaining < 0) {
                    this.percentRemaining = 0;
                }
                break;
            } else {
                System.out.println("INVALID. Please enter 'big', 'medium', or 'small'.");
            }
        }
     }
        
    }
    
    public void askSprinkles() {
        
        while(true) {
            System.out.println("Does the donut have sprinkles?");
        
            String answer = reader.nextLine();
            answer.trim();
            answer.toLowerCase();
            
            if(answer.equals("yes")) {
                sprinkles = true;
                break;
            } else if(answer.equals("no")) {
                sprinkles = false;
                break;
            } else {
                System.out.println("INVALID RESPONSE. PLEASE TYPE 'YES' OR 'NO'.");
            }
        }
    }
    
    public void askGlazed() {
        while(true) {
            System.out.println("Is the donut glazed?");
        
            String answer = reader.nextLine();
            answer.trim();
            answer.toLowerCase();
            
            if(answer.equals("yes")) {
                glazed = true;
                break;
            } else if(answer.equals("no")) {
                glazed = false;
                break;
            } else {
                System.out.println("INVALID RESPONSE. PLEASE TYPE 'YES' OR 'NO'.");
            }
        }
    }
    
    public String checkForSprinkles() {
        if(!sprinkles) {
            return "No";
        }
        
        return "Yes";
    }
    
    public String checkIfGlazed() {
        if(!glazed) {
            return "No";
        }
        
        return "Yes";
    }
    
    public void printStats() {
        this.askSprinkles();
        this.askGlazed();
        
        System.out.println("");
        
        System.out.println("*****DONUT STATS*****");
        System.out.println("Name: " + name);
        System.out.println("Flavor: " + flavor);
        System.out.println("Calories: " + calories);
        System.out.println("Percentage of Donut Remaining: " + percentRemaining);
        System.out.println("Does the donut contain sprinkles?: " + this.checkForSprinkles());
        System.out.println("Is the donut glazed?: " + this.checkIfGlazed());
        System.out.println("");
    }
    
    
}
