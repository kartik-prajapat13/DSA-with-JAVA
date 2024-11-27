public class Upperbound {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 7, 8, 9, 9, 9, 11 };
        int result = uppbound(arr, 9);
        System.out.println("Upper Bound index is at : " + result);
    }

    static int uppbound(int[] arr, int x) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
