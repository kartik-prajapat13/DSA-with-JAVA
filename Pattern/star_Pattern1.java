class star_Pattern1 {
    public static void main(String[] args) {
        pattern(4);
        invertpattern(4);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------ INVERTED STAR -------------

    static void invertpattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
