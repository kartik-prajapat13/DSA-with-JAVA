public class number_pattern {

    public static void main(String[] args) {

        pattern(5);
        invertnumber(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void invertnumber(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
