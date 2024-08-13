import java.util.Scanner;

public class sum_average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of your elements : ");
        int size = sc.nextInt();

        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            i++;
        }
        int total = sum(num);
        System.out.println("Sum of the array elements: " + total);

        int avg = average(num);
        System.out.println("Average of the array elements: " + avg);
    }

    public static int sum(int[] num) {
        int sum = 0;
        int i = 0;
        while (i < num.length) {
            sum += num[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] num) {
        int a = sum(num);
        return (a / num.length);
    }
}
