import java.util.Scanner;

public class Insertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr, n);

        System.out.print("Sorted array is  : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertion_sort(int arr[], int n) {

        for (int i = 1; i < n - 1; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
