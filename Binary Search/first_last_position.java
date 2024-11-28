// first and last occurrence of an element in a sorted array using Binary search

class first_last_position {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1, first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                first = mid; // Update `first` and move `high` to search left
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return first;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1, last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                last = mid; // Update `last` and move `low` to search right
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return last;
    }

    // Main method to test the code
    public static void main(String[] args) {
        first_last_position solution = new first_last_position();

        // Test case 1
        int[] nums1 = { 5, 7, 7, 8, 8, 10 };
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("First and Last Position: [" + result1[0] + ", " + result1[1] + "]");

    }
}
