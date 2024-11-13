public class Twosum {

    public static void main(String[] args) {

        int[] arr = { 2, 6, 5, 8, 10 };
        int target = 14;
        twosum(arr, target);
    }

    static void twosum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found with : " + arr[i] + " and " + arr[j]);
                    return;
                }

            }

        }
        System.out.println("No");

    }
}