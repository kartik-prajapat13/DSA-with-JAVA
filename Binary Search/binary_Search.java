public class binary_Search {

    public static int binarysearch(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) { // Found
                return mid;
            } else if (numbers[mid] < key) { // Right
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 40;
        int ans = binarysearch(numbers, key);
        System.out.println("Array number : " + ans);
        if (ans == -1) {
            System.out.println("Target is not in given array");
        } else {
            System.out.println("Target Found Successfully");
        }
    }

}
