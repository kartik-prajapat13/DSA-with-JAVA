import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Element" + (i + 1) + ":");
            nums[i] = sc.nextInt();
            i++;
        }

        int newLength = duplicate(nums);

        // Output the new length and the array elements after removing duplicates
        System.out.println("New length after removing duplicates: " + newLength);
        // System.out.print("Array after removing duplicates: ");
        for (int j = 0; j < newLength; j++) {
            System.out.print(nums[j] + " ");
        }

    }

    public static int duplicate(int nums[]) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}