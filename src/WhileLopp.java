import java.util.Scanner;

public class WhileLopp {

    /*

        while(condition){
            //block
        }

        while(true){
            System.out.print("1 0");
        }

        while(i <= 6){ // 0, 1, 2,3 ,4, 5, 6, 
            System.out.println(i + " -> I am ikhlaq");
            i++;
        }

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        int i = 0;
        while(i <= 10){
            System.out.println( number +" * " + i + " = " + (number * i));
            i++;
        }
      
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number_1;
        int number_2;
        char op, ch ='b';
        int result = 0;


        while(ch == 'y' || ch == 'Y'){

            System.out.println("Enter a number:");
            number_1 = sc.nextInt();
            System.out.println("Enter a second number:");
            number_2 = sc.nextInt();
            System.out.println("Enter + - * % / ");
            op = sc.next().charAt(0);

            switch (op) {
                case '+':{
                    result = number_1 + number_2;
                    break;
                }
                case '-':{
                    result = number_1 - number_2;
                    break;
                }
                case '*':{
                    result = number_1 * number_2;
                    break;
                }
                case '/':{
                    result = number_1 / number_2;
                    break;
                }
                case '%':{
                    result = number_1 % number_2;
                    break;
                }
                default:{
                    System.out.println("Invalid operation");
                    break;
                }
                
            }
            System.out.println("Output: "+ result);

            System.out.println("Enter y to continue:");
            ch = sc.next().charAt(0);

        }

    
    }
    
}
