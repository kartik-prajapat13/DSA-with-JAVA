public class Lowerbound {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 7, 8, 9, 9, 9, 11 };
        int result = lowbound(arr, 12);
        System.out.println("Low Bound index: " + result);
    }

    static int lowbound(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n; // Initialize `ans` to `n` (out of bounds)

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid; // Update ans to the current index
                high = mid - 1; // Move to the left half
            } else {
                low = mid + 1; // Move to the right half
            }
        }

        return ans;
    }
}
