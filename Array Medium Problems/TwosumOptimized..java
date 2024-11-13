import java.util.Arrays;

public class TwosumOptimized {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 9 };
        int target = 555;
        String result = twosum(n, arr, target);
        System.out.println(result);
    }

    static String twosum(int n, int[] arr, int target) {
        Arrays.sort(arr); 

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return "YES";
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        
        return "NO";
    }
}
