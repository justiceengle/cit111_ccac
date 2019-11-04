package looping;

//demo of while loop

public class SimpleLoop {
    public static void main(String[] args) {
        int count = 0;
        int numLoops = 900000;
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        
        System.out.println("Start looping at " + startTime);
        
        while(count < numLoops) {
            System.out.println("Change oil.");
            System.out.println("Val of Count: " + count);
            count = count + 1;
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Stopped looping at " + endTime);
        
        long timeElapsed = (endTime - startTime) / 1000;
        System.out.println("Time to loop: " + timeElapsed + " seconds");
        
        
        
        
        
    } // close main
    
}
