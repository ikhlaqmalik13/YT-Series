import java.util.Scanner;

public class FlowControl {

    /*
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
            System.out.println("Zero");
        }

        if(speed > 60){
            System.out.println("Chalaan kat gaya tera");
        }else if( (speed > 50) && (speed < 60) ){
            System.out.println("baal baal bach gaya tu");
        }
        else{
            System.out.println("Bachh gaya tu!");
        }

        if(age >= 18){
            if(isCitizen){
                System.out.println("You can cast a vote!");
            }else{
                System.out.println("You can cast a  vote");
            }
        }else{
            System.out.println("Grow up child");
        }
     
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ext;

        System.out.println("Enter a file extension:");
        ext = sc.next();

        if(ext.equals(".png")){
            System.out.println("File is PNG");
        }else if(ext.equals(".pdf")){
            System.out.println("File is pdf");
        }else if(ext.equals(".mp3")){
            System.out.println("File is Mp3");
        }else{
            System.out.println("unknown");
        }

        sc.close();
    }
    
}
