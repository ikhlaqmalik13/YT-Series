import java.util.Scanner;;

public class Switch {

    /*

       switch(exp){

            case __ : {
                // statements
                break;
            }
            case __ : {
                // statements
                break;
            }
            case __ : {
                // statements
                break;
            }
            default : {
                // statements
                break;
            }


       }

        switch (color) {

            case "RED" : {
                System.out.println("Stop!");
                break;
            }
            case "GREEN" : {
                System.out.println("Accelerate!");
                break;
            }
            case "YELLOW" : {
                System.out.println("Prepare!");
                break;
            }
            default : {
                System.out.println("Error is detecting the color!");
                break;
            }
        }

        switch (juice) {

            case "A" : {
                System.out.println("Dispensing Apple juice!");
                break;
            }
            case "B" : {
                System.out.println("Dispensing Banana shake!");
                break;
            }
            case "C" : {
                System.out.println("Dispensing Carrot juice!");
                break;
            }
            default : {
                System.out.println("Something went wrong");
                break;
            }
        }
    
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char key;

        System.out.println("Enter the A - LEFT, W - UP, S - DOWN, D - RIGHT to move character");
        key = in.next().charAt(0);

        switch (key) {
            case 'A' : {
                System.out.println("MOVING LEFT!");
                break;
            }
            case 'W' : {
                System.out.println("MOVING UP!");
                break;
            }
            case 'S' : {
                System.out.println("MOVING DOWN!");
                break;
            }
            case 'D' : {
                System.out.println("MOVING RIGHT!");
                break;
            }
            default : {
                System.out.println("UNKNOWN KEY");
                break;
            }
        }

        in.close();
        
    }
    
}
