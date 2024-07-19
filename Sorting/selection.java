import java.util.Scanner;

public class selection {

    public static void main(String[] args) {
        // int arr[] = { 22, 34, 66, 33, 2 };
        // selection(arr, 5);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr, n);

        System.out.print("Sorted array is  : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selection(int arr[], int n) {

        for (int i = 0; i <= n - 2; i++) {
            int min_index = i; // current index
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;

                }

            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}