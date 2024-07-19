import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr, n);

        System.out.print("Sorted array is  : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubble_sort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/*
 * n - i - 1 ensures that we do not compare elements that are already sorted.
 * For example, in the first pass (i = 0),
 * the inner loop runs n-1 times. In the second pass (i = 1), it runs n-2 times,
 * and so on.
 */
