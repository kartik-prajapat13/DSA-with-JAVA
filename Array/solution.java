import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element : ");
        int size = sc.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            i++;
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int a = occur(num, target);
        System.out.println("No of occurences : " + a);

    }

    public static int occur(int[] num, int target) {
        int i = 0;
        int oc = 0;
        for (i = 0; i < num.length; i++) {
            if (num[i] == target) {
                oc++;
            }
        }
        return oc;
    }
}
