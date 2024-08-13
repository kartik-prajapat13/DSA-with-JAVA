import java.util.Scanner;

public class occurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter the element to find occurrences: ");
        int target = sc.nextInt();
        int occ = occur(nums, target);
        System.out.println("Number of times " + target + " occurs: " + occ);

    }

    public static int occur(int[] nums, int target) {
        int oc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                oc++;
            }
        }
        return oc;
    }

}
