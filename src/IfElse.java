import java.util.Scanner;

public class IfElse {

    /*
        if(boolean_ expreaion){

        }else if( another_cond){

        }else{

        }

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        if(number > 0){
            System.out.println("Postive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero!");
        }

        if(speed > 60){
            System.out.println("Chalaan kat gaya tera!");
        }else if(speed > 50 && speed < 60){
            System.out.println("Baal baal bach gaya tu!");
        }else{
            System.out.println("Bach gaya tu!");
        }

        if(age >= 18){
            if(isCitizen){
                System.out.println("You can cast a vote!");
            }else{
                System.out.println("You can't cast a vote!");
            }
        }else{
            System.out.println("Grow up!");
        }

        if(ext.equals(".pdf")){
            System.out.println("PDF file");
        }else if(ext.equals(".png")){
            System.out.println("PNG file");
        }else if(ext.equals(".mp3")){
            System.out.println("MP3 file");
        }else{
            System.out.println("UnKnown file");
        }

     
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1, number2;
        int result = 0;
        char op;

        System.out.println("Enter one number:");
        number1 = in.nextInt();

        System.out.println("Enter second number:");
        number2 = in.nextInt();

        System.out.println("Enter + - * / % :");
        op = in.next().charAt(0);

        if(op == '+'){
            result = number1 + number2;
            System.out.println("Sum: " + result);
        }else if (op == '-'){
            result = number1 - number2;
            System.out.println("Sub: " + result);
        }else if (op == '/'){
            result = number1 / number2;
            System.out.println("Div: " + result);       
        }else if (op == '*'){
            result = number1 * number2;
            System.out.println("Mul: " + result);       
        }else if (op == '%'){
            result = number1 % number2;
            System.out.println("Mod: " + result); 
        }else{
            System.out.println("Invalid operation");
        }

        in.close();
    }
    
}
