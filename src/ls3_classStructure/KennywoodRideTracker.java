package ls3_classStructure;

import java.util.Random;

public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    final static int MIN_THEME = 48;
    final static int MIN_THRILL = 54;
    private static Random randomizer = new Random();
    
    public static void main(String[] args) {
        printRideStats();
        rideBlackWidow(10, 54);
        printRideStats();
        rideMerryGoRound(5, 60);
        printRideStats();
        rideBlackWidow(15, 44);
        printRideStats();
    }
    
    public static void rideBlackWidow(int riders, int avgHeight) {
        System.out.println("NOW RIDING THE BLACK WIDOW... WEEEEEEEEEEEE!");
        System.out.println("");
        
        if(avgHeight >= MIN_THRILL) {
            totalRiders += riders;
            int number = randomizer.nextInt(riders);
            totalSickRiders += number;
        } else {
            totalFailedRideAttempts += riders;
        }
        
    }
    
    public static void rideMerryGoRound(int riders, int avgHeight) {
        System.out.println("NOW RIDING THE MERRY-GO-ROUND... ZZZZZZZZZZZZZZZ...");
        System.out.println("");
        
        if(avgHeight >= MIN_THEME) {
            totalRiders += riders;
            int number = randomizer.nextInt(riders);
            totalSickRiders += number;
        } else {
            totalFailedRideAttempts += riders;
        }
    }
    
    public static void printRideStats() {
        System.out.println("*******RIDER STATS*******");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*************************");
        System.out.println("");
    }
}
