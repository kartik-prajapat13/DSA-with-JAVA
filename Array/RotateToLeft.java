import java.util.Scanner;

public class RotateToLeft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate left: ");
        int k = sc.nextInt();

        // Adjust k if it is greater than size
        // k = k % size;

        // Call the method to rotate the array
        rotation(nums, size, k);

        // Output the array after rotating left
        System.out.println("Array after rotating left by " + k + " positions: ");
        for (int j = 0; j < size; j++) {
            System.out.print(nums[j] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotation(int[] arr, int n, int k) {
        reverse(arr, 0, k - 1); // Reverse the first k elements

        reverse(arr, k, n - 1); // Reverse the remaining elements

        reverse(arr, 0, n - 1); // Reverse the entire array
    }
}
