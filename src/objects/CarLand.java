
package objects;

/**
 * Client class to Car
 * Contains the main method
 * @author justice.engle
 */

public class CarLand {
    public static void main(String[] args) {
        Car toyCar = new Car("Ford", "Monster Truck", 2019, 1.75, "grey", false);
        
        toyCar.stats();
        
        toyCar.startEngine();
        
        toyCar.accelerate(88);
        
        toyCar.stats();
        
        toyCar.decelerate(100);
        
        toyCar.stats();
        
        
        
        
        
        
        
        
    } // close main
} // close class
