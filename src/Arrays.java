import java.util.Scanner;

public class Arrays {

    /*
       int name = 6;
       data_type[] name = {1, 2, 3, 4};
       data_type[] name = new data_type[size];
       int[] nos = {1, 2, 3, 4, 5};
       int[] nos = new int[5];

       nos[0] = 10;


       int[] nos = {1,2, 3, 4, 5};

        System.out.println(nos[0]);
        System.out.println(nos[1]);
        System.out.println(nos[2]);
        System.out.println(nos[3]);
        System.out.println(nos[4]);

        for(int i=0; i<5; i++){
            System.out.println("Enter no to store at "+ (i+1));
            nos[i] = sc.nextInt();
        }
        
        System.out.println("Values stored: ");
        for(int i =0; i<nos.length; i++){ 
            System.out.println(nos[i]);
        }

        for(int i=0; i<nos.length; i++){
            sum = sum + nos[i];
            System.out.println("Sum at " + i + "th iteration " + sum);
        }
        

     
     */

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int[] nos = new int[5];    // 1 2 3 4 5 
        // int toFind = 0;

        // for(int i=0; i<nos.length; i++){
        //     System.out.println("Enter no at "+ (i+1));
        //     nos[i] = sc.nextInt();
        // }

        // System.out.println("eNTER NO. TO find its index:");
        // toFind = sc.nextInt();

        // int index = -1;

        // for(int i=0; i<nos.length; i++){
        //     if(toFind == nos[i]){
        //         index = i;
        //     }
        // }

        // if(index != -1){
        //     System.out.println("Element found at :" + index);
        // }else {
        //     System.out.println("Element not found:");
        // }
        
        // sc.close();

        int rollNo = 6;
       
        int[] rollNos = new int[5]; // _ _ _ _ _ 
        rollNos[0] = 2;
        rollNos[1] = 3;
        rollNos[2] = 30;
        rollNos[3] = 39;
        rollNos[4] = 21;

        System.out.println(rollNos[3]);
    
        System.out.println(rollNo);

        // int[] arr = new int[5]; // 1 _ _ _ _ 
        // arr[0] = 1;
        // arr[1] = 2;
        
    }
    
}
