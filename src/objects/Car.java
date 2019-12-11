
package objects;



public class Car {
    public String make;
    public String model;
    public int year;
    public double mpg;
    public String color;
    // only methods in this class can access private member variables
    private boolean engineOn;
    private double speed;
    
    public Car(String make, String model, int year, double mpg, String color, boolean engineOn) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mpg = mpg;
        this.color = color;
        this.engineOn = engineOn;
        this.speed = 0.0;
    }
    
    
    /**
     * Simulates starting this instance of Car's engine
     * 
     */
    public void startEngine() {
        engineOn = true;
        System.out.println("... crank ... sputter ... vroom!");
        System.out.println("");
    }
    
    /**
     * Simulates stopping this instance of Car's engine
     */
    public void stopEngine() {
        System.out.println("... pluuuuuuuunk ...");
        engineOn = false;
    }
    
    /**
     * Getter method for retrieving engine status
     * @return 
     */
    public boolean checkEngineStatus() {
        return engineOn;
    }
    
    public void accelerate(int a) {
        if(engineOn) {
            speed += a;
        } else {
            
        }
    }
    
    public void decelerate(int d) {
        if(speed > d && engineOn) {
            speed -= d;
        } else if(speed < d && engineOn) {
            speed = 0.0;
        } else {
            
        }
    }
    
    public void stats() {
        System.out.println("***STATS***");
        System.out.println(this.year + " " + this.make + " " + this.model);
        System.out.println("Is the engine running? " + this.engineOn);
        System.out.println("Current speed: " + this.speed);
        System.out.println("***********");
        System.out.println("");
    }
    
    
}
