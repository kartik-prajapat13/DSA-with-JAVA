// Find maximum and minimum element in the array 

import java.util.Scanner;

public class Max_min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            i++;
        }

        int max_num = max(num);
        System.out.println("Max element in the array is : " + max_num);

        int min_num = min(num);
        System.out.println("Min element in the array is : " + min_num);

    }

    public static int max(int[] num) {
        // if the size of the array given 0 initially then it will give min value may be
        // negative or zero
        if (num.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = num[0]; // Consider first index value max so later we compare all the number from index
                          // 1

        int j = 1;

        while (j < num.length) {

            if (max < num[j]) {
                max = num[j];
            }
            j++;
        }

        return max;
    }

    public static int min(int[] num) {
        if (num.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = num[0];
        int i = 1;

        while (i < num.length) {
            if (min > num[i]) { // Change only here
                min = num[i];
            }
            i++;
        }

        return min;
    }
}
