import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        
        // float radius = 0f;
       
    
        // System.out.print("Enter a radius: ");
        // radius = sc.nextFloat();
        

        // System.out.println("Area : " + (3.14 * radius * radius));

        Scanner sc = new Scanner(System.in);
        String name;
        char ch;

        System.out.println("Enter y to contine:");
        ch = sc.nextLine().charAt(0);

        System.out.println("You entered " + ch);
        


        sc.close();
    }
    
}
