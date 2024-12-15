import java.lang.reflect.Array;

public class Exception_hand {
    public static void main(String args[]){
        int a[]=new int[3];

        try{
            System.out.println(a[4]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage()); //SHow type of error it consist of ]
            System.out.println("Catch the error ");
        }
    }
}
