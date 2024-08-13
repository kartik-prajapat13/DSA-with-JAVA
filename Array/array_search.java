import java.util.Scanner;

public class array_search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myarr = { 1, 2, 3, 5, 56, 78 };

        System.out.println("Enter the number you wanna search : ");
        int num = sc.nextInt();

        boolean isFound = isFound(myarr, num);
        if (isFound) {
            System.out.println("Number found in the array");
        } else {
            System.out.println("Number not found in the array");
        }
    }

    public static boolean isFound(int[] myarr, int num) {
        int i = 0;
        while (i < myarr.length) {
            if (myarr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
