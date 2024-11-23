public class Linear_search {

    public static int linearsearch(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 5, 4, 7, 8 };
        int key = 8;

        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Number at  : " + index);
        }
    }
}
