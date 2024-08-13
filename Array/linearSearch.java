public class linearSearch {

    static int linear(int[] arr, int n, int target) {

        // int target = 5;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at : " + i);
                return i;
            }
        }
        System.out.println("Not present");
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 7 };
        int n = arr.length;
        int lin = linear(arr, n, 7);
    }
}
