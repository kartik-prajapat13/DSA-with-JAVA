public class MissingNo {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 0, 1, 2, 3, 5 };
        int ans = missingno(arr, n);
        System.out.println("Missing No : " + ans);
    }

    public static int missingno(int arr[], int n) {

        for (int i = 0; i <= n; i++) {

            int flag = 0;

            for (int j = 0; j < n - 1; j++) {

                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }
}
