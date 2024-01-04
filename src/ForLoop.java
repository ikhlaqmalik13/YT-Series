import java.util.Scanner;

public class ForLoop {

    /*
        for(intialization; test_expresion; increment_or_decrement){
            // block
        }

        for(datatype email : emails){

        }

        for(int i=0; i<5; i++){ // 0 1 2 3 4 
            System.out.println(i + " ->I am Ikhlaq");
        }

        for(int i=1; i<=10; i++){ // 0 1 2 3 4 
            System.out.println(i);
        }

        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        2 * i = 2 * i

        for(int i=1; i<=20; i++){
            System.out.println( number +" * " + i + " = " + (number * i) );
        }

        for(int i=0; i<emails.length; i++){ // 0, 1, 2

            System.out.println("Sending MSG: " + msg);
            System.out.println("TO: " + emails[i]);

        }

        String[] emails = {"ikhlaq@gmail.com", "xyz.12@gamil.com", "123.as@gmail.com", "qwrt@gmail.com"};
        String msg = "Heloo, You are invited to the program";


        for(String email : emails){

            System.out.println("Sending email to : " + email );

        }

        int sum = 0;

        for(int i=1; i<100; i++){
            sum += i;
        }

        System.out.println("Sum :" + sum);

        String name = "Ikhlaq Yousuf Malik";

    
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
     
     */

    public static void main(String[] args) {

        for(int i=10; i>=0; i--){
            System.out.println(i);
        }
        
    }
    
}
