import java.util.Scanner;

public class all_divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int k = n % i;

            if (k == 0) {
                System.out.print(i + " ");

                sum += i;
            }

        }
        System.out.println("Sum: " + sum);
    }

}
