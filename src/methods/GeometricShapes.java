package methods;

import java.util.Scanner;

public class GeometricShapes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double cubeLength = reader.nextDouble();
        
        System.out.println("The volume of a cube with side length " + cubeLength + " is " + cubeVolume(cubeLength));
        System.out.println("*************************************************");
        
        System.out.println("Enter cylinder radius:");
        double cylinderRadius = reader.nextDouble();
        System.out.println("Enter cylinder height:");
        double cylinderHeight = reader.nextDouble();
        
        System.out.println("The volume of a cylinder with a radius of " + cylinderRadius + 
                " and a height of " + cylinderHeight + " is " + cylinderVolume(cylinderRadius, cylinderHeight));
        System.out.println("*************************************************");
        
        System.out.println("Enter the two side lengths of the trapezoid, followed by the height:");
        double trapSide1 = reader.nextDouble();
        double trapSide2 = reader.nextDouble();
        double trapHeight = reader.nextDouble();
        
        System.out.println("The area of the " + trapSide1 + "x" + trapSide2 + 
                "x" + trapHeight + " trapezoid is " + trapezoidArea(trapSide1, trapSide2, trapHeight));
        
        System.out.println("Enter a side length of the octagon:");
        double octagonSide = reader.nextDouble();
        System.out.println("Enter the octagon height:");
        double octagonHeight = reader.nextDouble();
        
        System.out.println("The area of the octagon is " + octagonArea(octagonSide, octagonHeight));
        
    }
    
    public static String cubeVolume(double length) {
        double volumeOfCube = length * length * length;
        
        return String.format("%.2f", volumeOfCube);
    }
    
    public static String cylinderVolume(double radius, double height) {
        double volumeOfCylinder = 3.14159 * (radius * radius) * height;
        
        return String.format("%.2f", volumeOfCylinder);
    }
    
    public static String trapezoidArea(double length1, double length2, double height) {
        double area = ((length1 + length2) / 2) * height;
        
        return String.format("%.2f", area);
    }
    
    public static String octagonArea(double lengthSide, double height) {
        double volume = 2 * (1 + Math.sqrt(2.0)) * Math.pow(lengthSide, 2) * height;
        
        return String.format("%.2f", volume);
    }
}
