public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibona(3));
    }

    static int fibona(int n) {

        if (n <= 1)
            return n;

        int last = fibona(n - 1);
        int slast = fibona(n - 2);

        return last + slast;
        // return n;
    }

}
