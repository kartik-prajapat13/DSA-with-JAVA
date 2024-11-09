// XOR 1^1=0
//2^0=2

public class numappearanceonce {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3 };
        int ans = singleNumber(arr);
        System.out.println("Number that appears once is: " + ans);
    }

    public static int singleNumber(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num; // XOR each element with result
        }

        return result;
    }
}
