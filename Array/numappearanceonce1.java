public class numappearanceonce1 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 1, 2, 3, 3 };
        int ans = singlenum(arr);
        System.out.println("Number that appears once is: " + ans);
    }

    public static int singlenum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    cnt++;
                }
            }
            // If count of current number is 1, return it
            if (cnt == 1) {
                return num;
            }
        }

        return -1; // Return -1 if no unique element is found (for completeness)
    }
}
