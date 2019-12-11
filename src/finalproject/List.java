/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Family
 */
public class List {
    ArrayList<Task> toDoList;
    
    public List() {
        toDoList = new ArrayList<Task>();
    }
    
    public void addTask(String task, boolean answer) {
        String neatTask = task;
        neatTask = neatTask.trim();
        neatTask = neatTask.toLowerCase();
        this.toDoList.add(new Task(neatTask, answer));
    }
    
    public void completeTask(String task) {
        String neatTask = task;
        neatTask = neatTask.trim();
        neatTask = neatTask.toLowerCase();
        
        for(int i = 0; i < this.toDoList.size(); i++) {
            String taskName = this.toDoList.get(i).taskName;
            
            if(neatTask.equals(taskName)) {
                this.toDoList.get(i).isComplete = true;
                this.toDoList.remove(i);
            }
        }
    }
    
    public void printList() {
        for(int i = 0; i < this.toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + this.toDoList.get(i).taskName);
        }
        System.out.println("");
    }
    
    public void printPriorityList() {
        int c = 1;
        for(int i = 0; i < this.toDoList.size(); i++) {
            if(this.toDoList.get(i).isPriority) {
                System.out.println(c + ". " + this.toDoList.get(i).taskName);
                c = c + 1;
            }
        }
        System.out.println("");
    }
}

