public class duplicate_count {

    // Function to find the first occurrence of a target element
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid; // Update first and look left
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }

        return first;
    }

    // Function to find the last occurrence of a target element
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid; // Update last and look right
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }

        return last;
    }

    // Function to count occurrences of a target element
    public static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1)
            return 0; // Target not found
        int last = lastOccurrence(arr, target);
        return (last - first + 1); // Count occurrences
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int target = 8;
        int count = countOccurrences(arr, target);
        System.out.println("The number of occurrences of " + target + " is: " + count);
    }
}
