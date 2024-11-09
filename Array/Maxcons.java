public class Maxcons {
    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int ans = maxConsecutiveOnes(arr, n);
        System.out.println("Max Consecutive 1's: " + ans);
    }

    public static int maxConsecutiveOnes(int arr[], int n) {
        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }

        return maxi;
    }
}
