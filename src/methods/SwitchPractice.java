
package methods;



public class SwitchPractice {
    public static void main(String[] args) {
        final int SELECTOR = 1;
        
        switch(SELECTOR) {
            case 1:
                System.out.println("First case selected");
                break;
            case 2:
                System.out.println("Second case selected");
                break;
            case 78:
                System.out.println("Case can match any value");
                break;
            default:
                System.out.println("Default case");
        }
    }
}
