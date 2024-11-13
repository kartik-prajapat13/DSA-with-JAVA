//Better solution

import java.util.*;

public class Twosum_hash {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 9 };
        int target = 555;
        String result = twosum(n, arr, target);
        System.out.println(result);

    }

    public static String twosum(int n, int[] arr, int target) {

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int more = target - num;

            if (mpp.containsKey(more)) {
                return "Yes";
            }
            mpp.put(arr[i], i);
        }
        return "No";
    }
}
