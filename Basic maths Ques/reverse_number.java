import java.util.*;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while (a > 0) {
            int lastdigit = a % 10;
            // System.out.print(lastdigit + " ");

            rev = (rev * 10) + lastdigit;
            a = a / 10;
            System.out.println(rev);
        }
        System.out.println();

    }
}