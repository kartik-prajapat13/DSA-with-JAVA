import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Call the movezeroes method
        nums = movezeroes(size, nums);

        // Print the array after moving zeroes
        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Close the scanner
        sc.close();
    }

    // Changed the return type to int[] to match the returned value
    public static int[] movezeroes(int n, int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        // Copy the non-zero elements to the original array
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // Fill the remaining array with zeroes
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

        return arr; // Returning the modified array
    }
}
