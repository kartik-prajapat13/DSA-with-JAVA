// check whether the array is sorted or not (both increasing and decreasing way)

import java.util.Scanner;

public class sortedOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element : ");
            num[i] = sc.nextInt();
            i++;
        }

        boolean dec = decreasing(num);
        boolean inc = increasing(num);
        if (dec || inc) {
            System.out.println("array is sorted");

        } else {
            System.out.println("Not sorted");
        }

    }

    public static boolean decreasing(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] < num[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean increasing(int[] num) {
        int i = 1;

        while (i < num.length) {
            if (num[i] > num[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }
}
