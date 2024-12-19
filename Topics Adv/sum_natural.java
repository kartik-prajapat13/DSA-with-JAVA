import java.util.*;
public class sum_natural {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : " );
        int n=sc.nextInt();
        int sum=0;
        int i=1;

        while(i<=n){
            sum+=i;
            System.out.println(sum);
            i++;
        }
        
    }
    
}
