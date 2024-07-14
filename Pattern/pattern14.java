public class pattern14 {
    public static void main(String[] args) {
        pattern(5);

        invertpattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i <= n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void invertpattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
