/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;


import java.util.Scanner;
/**
 *
 * @author Family
 */
public class Main {
    public static void main(String[] args) {
        List toDoList = new List();
        Scanner reader = new Scanner(System.in);
        
        System.out.println("WELCOME TO YOUR TO DO LIST!");
        while(true) {
            System.out.println("MAIN MENU:");
            System.out.println("Please choose an action from the menu by pressing its corresponding number");
            System.out.println("1. Add task");
            System.out.println("2. Complete task");
            System.out.println("3. Print list");
            System.out.println("4. Print priority list");
            System.out.println("5. Quit");
            System.out.println("");
            System.out.print("Enter number: ");
            
            int response = Integer.parseInt(reader.nextLine());
            
            if(response == 5) {
                break;
            } else if(response == 1) {
                System.out.print("What is the task?: ");
                String task = reader.nextLine();
                while(true) {
                    System.out.print("Is the task a priority? (1 for 'yes', 2 for 'no'): ");
                    int priorityCheck = Integer.parseInt(reader.nextLine());
                    if(priorityCheck == 1) {
                        toDoList.addTask(task, true);
                        break;
                    } else if(priorityCheck == 2) {
                        toDoList.addTask(task, false);
                        break;
                    }
                }
                System.out.println("");
                System.out.println("Task added!");
                System.out.println("");
            } else if(response == 2) {
                System.out.print("Please type the task as it was typed when first added: ");
                String completedTask = reader.nextLine();
                
                toDoList.completeTask(completedTask);
                System.out.println("");
                System.out.println("Task complete!");
                System.out.println("");
            } else if(response == 3) {
                toDoList.printList();
            } else if(response == 4) {
                toDoList.printPriorityList();
            } else {
                System.out.println("***INVALID ENTRY***");
            }
        }
        
    
    
    }
}
