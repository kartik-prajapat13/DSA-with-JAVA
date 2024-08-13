import java.util.Scanner;

public class Secondlargest_small {

    static int SecondLargest(int[] arr, int n) {

        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    static int SecondSmallest(int arr[], int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int seclarge = SecondLargest(arr, size);
        System.out.print("The second largest element is : ");
        System.out.println(seclarge);

        System.out.println();

        int secsmall = SecondSmallest(arr, size);
        System.out.print("The second smallest element is : ");
        System.out.println(secsmall);
    }
}
