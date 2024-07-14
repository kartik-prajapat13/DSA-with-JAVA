public class pattern11 {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int i = 0; i < n; i++) {

            int start = 1;

            if (i % 2 == 0) // For even rows start with 1
                start = 1;

            else
                start = 0;

            for (int j = 0; j < i; j++) {

                System.out.print(start + " ");
                start = 1 - start; // For zero
            }
            System.out.println();
        }

    }
}

/*
 * 0
 * 1 0
 * 0 1 0
 * 1 0 1 0
 */