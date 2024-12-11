// 11.19
import java.util.*;

public class Binary_Decimal {


    // ----------------------Binary to Decimal ------------------------
    /* 
    public static void binTOdec(int bin_num) {
        int my_num=bin_num;
        
        int dec_num=0;
        int pow=0;
        
        while(bin_num>0){
            int last_digit=bin_num%10;
            dec_num=dec_num+(last_digit*(int)Math.pow(2,pow));
            pow++;
            bin_num=bin_num/10;
            
        }
        System.out.println(dec_num);
    }
    public static void main(String[] args) {
        binTOdec(111);
        
    }
    */

// --------------------- Decimal to Binary number ----------------------



public static void decTObin(int n) {
    int my_num=n;
    int pow=0;
    int bin_num=0;

    while(n>0){
        int rem=n%2;
        bin_num=bin_num + (rem * (int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.println("Binary number of "+my_num+" = "+bin_num);
    
}
public static void main(String[] args) {
    decTObin(7);
}

}
