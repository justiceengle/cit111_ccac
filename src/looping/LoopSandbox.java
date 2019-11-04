package looping;

/**
 *
 * @author justice.engle
 */
public class LoopSandbox {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("Time ms: " + time);
        long seconds = time / 1000;
        System.out.println("Time sec: " + seconds);
        long hours = seconds / 60 / 60;
        System.out.println("Time hours: " + hours);
        long days = hours/24;
        System.out.println("Time days: "  + days);
        long years = days/365;
        System.out.println("Years: " + years);
    } // close main
} // close class
