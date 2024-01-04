import java.util.Random;
import java.util.Scanner;

public class DoWhile {

    /*
       while(cond){
         
       }

       do {
        
       } while(cond);

        int i = 0;
        System.out.println("Do while");
        do {
            System.out.println(i);
            i++;
        } while(i >= 10);

        System.out.println("while");
        i = 0;
        while(i >= 10){
            System.out.println(i);
            i++;
        }
      
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int computerGuessedNo = rand.nextInt(6) + 1;
        int tries = 0;

        do {
            System.out.println("Guess a number:");
            int userGuess = sc.nextInt();
            tries++;

            if(userGuess == computerGuessedNo){
                System.out.println("Congraulations! You guessed the no. correctly!");
                break;
            }else{
                System.out.println("Incorect guess, ONly " + (3 - tries) + " tries left!");
            }

            if(userGuess < computerGuessedNo){
                System.out.println("COmputer has somthing bigger no. in mind");
            }

            if(userGuess > computerGuessedNo){
                System.out.println("Computer has smthing smaller no. in mind");
            }

        } while(tries < 3);

        sc.close();

    
    }
    
}
