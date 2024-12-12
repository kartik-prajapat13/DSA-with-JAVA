import java.util.*;
public class binomial_coefficient {
    
    public static int fact(int n) {
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {

       
        int n_fact=fact(5);
        
        int r_fact=fact(2);
        
        int min_fact=fact(5-2);
        
        int div=(n_fact)/(r_fact*min_fact);
        
        System.out.println("ans:"+div);

        
        // 4!=4*3*2*1=24
    
    }
}
