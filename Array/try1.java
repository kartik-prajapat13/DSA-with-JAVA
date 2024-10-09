
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class try1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the no element : ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the element : ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        increasing(num);

        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    static void increasing(int[] num) {

        Arrays.sort(num);
    }

    static void decreasing(Integer[] num) {

        Arrays.sort(num, Collections.reverseOrder());
    }
}