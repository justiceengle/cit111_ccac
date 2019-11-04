/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author justice.engle
 */
public class ScopeBasics {
    
    private static String classScopeVariable = "All can see me!";
    
    public static void main(String[] args) {
        System.out.println("Inside main:");
        String localScope1 = "I'm local to main.";
        
        System.out.println(localScope1);
        System.out.println(classScopeVariable);
        System.out.println("");
        
        demonstrateScope();
        
        System.out.println(classScopeVariable);
    }
    
    public static void demonstrateScope() {
        System.out.println("Inside demostrateScope:");
        String localScope2 = "I'm local to demonstrate scope.";
        
        
        System.out.println(classScopeVariable);
        System.out.println(localScope2);
        
        classScopeVariable = "Scope shall set you free.";
    }
} // close class
