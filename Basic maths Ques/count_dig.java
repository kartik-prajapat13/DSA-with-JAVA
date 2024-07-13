import java.math.*;

public class count_dig {

    static int countdigit(int N) {
        int cnt = 0;

        while (N > 0) {
            int lastdigit = N % 10;
            cnt += 1;
            N = N / 10;

        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 19290;
        int digit = countdigit(n);
        System.out.println(digit);
    }

}

/*
 * public static void main(String[] args) {
 * int n = 10029;
 * int k = (int) (Math.log10(n) + 1);
 * System.out.println(k);
 * }
 */
