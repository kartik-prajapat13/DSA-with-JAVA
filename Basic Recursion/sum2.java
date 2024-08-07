public class sum2 {
    static int sum(int n) {

        if (n == 0) {
            return 0;
        } else {

            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(3);
        System.out.println(result);
    }
}
