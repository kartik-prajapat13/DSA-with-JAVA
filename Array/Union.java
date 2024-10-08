import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + " of first array: ");
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + " of second array: ");
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = findUnion(arr1, arr2, size1, size2);

        // Print the union of the arrays
        System.out.println("Union of the two arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }

        // Close the scanner
        sc.close();
    }

    // Method to find the union of two arrays
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        union.addAll(set);

        return union;
    }
}
