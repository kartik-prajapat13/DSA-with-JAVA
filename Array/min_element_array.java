import java.util.*;

public class min_element_array {
    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 10 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(min);

    }
}