import java.util.Scanner;

public class RotateLeft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter the number of positions to rotate left: ");
        int k = sc.nextInt();

        // Call the method to rotate the array
        RotateToLeft(nums, size, k);

        // Output the array after rotating left
        System.out.println("Array after rotating left by " + k + " positions: ");
        for (int j = 0; j < size; j++) {
            System.out.print(nums[j] + " ");
        }
    }

    public static void RotateToLeft(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }

        k = k % n;

        if (k > n) {
            return;
        }

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
}
