class try13 {

    static void func(int i, int n) {

        // Base Condition.
        if (i < 1)
            return;
        System.out.println(i);
        func(i - 1, n);

        // Function call to print i till i decrements to 1.

    }

    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(n, n);
    }
}