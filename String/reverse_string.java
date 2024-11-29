public class reverse_string {

    public static void main(String[] args) {
        String input1 = "Hi this is kartik";
        System.out.println(reversestr(input1));
    }

    public static String reversestr(String s) {
        // Split the string into words
        String[] words = s.trim().split("\\s+");

        // Reverse the words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words); // ["kartik", "is", "this", "Hi"] → "kartik is this Hi"
    }
}

/*
 * s.trim(): Removes leading and trailing spaces from the input string.
 * .split("\\s+"): Splits the string into an array of words using one or more
 * spaces as the delimiter.
 * For example:
 * Input: " Hi this is kartik "
 * After trimming: "Hi this is kartik"
 * After splitting: ["Hi", "this", "is", "kartik"].
 */