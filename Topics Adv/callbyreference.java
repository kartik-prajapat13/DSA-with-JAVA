// 11.6

import java.util.*;
public class callbyreference {

    public static void swap(int a, int b) {

        int temp=a;
        a=b;
        b=temp;
        //If i write these lines into main function then it will print original value of  a and b 
        System.out.println("a : "+a);
        System.out.println("b : "+b);       
        
    }
    public static void main(String[] args){
        
        int a=5;
        int b=10;
        swap(a,b);
                
    }
    
}
