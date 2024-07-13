import java.util.*;
import java.util.Scanner;

public class check_prime {

    // public static void main(String[] args) {
        
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the number : ");
    //     int a=sc.nextInt();

    //     for(int i=2;i<=a-1;i++){  
    //         if(a%i==0){
    //             System.out.println("Not a prime");
    //         }
    //         else{
    //             System.out.println("Prime");
    //         }
        
    // }

        
    // }


    //-------------------------------- OR---------------------------------------------------

    public static boolean isPrime(int n) {
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}
    

