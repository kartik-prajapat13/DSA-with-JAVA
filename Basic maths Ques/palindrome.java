import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        boolean isPalindrome = isPalindrome(a);

        if (isPalindrome) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }

    }

    public static boolean isPalindrome(int a) {
        return a == reverse(a);
    }

    public static int reverse(int a) {
        int reversed = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            reversed = reversed * 10 + lastDigit;
            a /= 10;
        }
        return reversed;
    }
}
