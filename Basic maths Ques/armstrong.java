import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            n = n / 10;
        }

        if (sum == originalNumber) {
            System.out.println("Arm");
        } else {
            System.out.println("Not arm");
        }
    }

}
