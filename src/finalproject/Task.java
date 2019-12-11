/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Family
 */
public class Task {
    String taskName;
    boolean isComplete;
    boolean isPriority;
    
    public Task(String taskName, boolean isPriority) {
        this.taskName = taskName;
        this.isPriority = isPriority;
    }
}

