import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number: ");
        int n2 = sc.nextInt();

        int gcd1 = findgcd(n1, n2);

        System.out.println(gcd1);

    }

    static int findgcd(int n1, int n2) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

        }
        return gcd;

    }
}
