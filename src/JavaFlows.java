import java.util.Scanner;

public class JavaFlows {

     /*
        
        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    */

    /*
         if(number > 0){
            System.out.println("Postive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
      
    */

    /*
       if(age >= 18){
            System.out.println("You can cast a vote!");
        }else{
            System.out.println("Grow up child!");
        }
    */

    /*
        if(age >= 18 && isCitizen){
            System.out.println("You can cast a vote!");
        }else{
            System.out.println("You can't cast a vote!");
        }
    */

    /*
        if(age > 18){

            if(isCitizen){
                System.out.println("You can cast a vote");
            }else{
                System.out.println("You aren't the citizen of India");
            }

        }else{
            System.out.println("Grow up!");
        }
     
     */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileExtension;
       
       
        System.out.println("Enter file type:");
        fileExtension = sc.next();

        if(fileExtension.equals(".pdf")){
            System.out.println("It is a pdf file");
        }else if(fileExtension.equals(".png")){
            System.out.println("It is a png file");
        }else if(fileExtension.equals(".mp3")){
            System.out.println("It is a mp3 file");
        }else{
            System.out.println("Unknown");
        }

        sc.close();

    }
    
}
