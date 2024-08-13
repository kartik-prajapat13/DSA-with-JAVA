import java.util.Scanner;

public class FrequencyChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        // Precompute
        // Instead of 26 if we take 256 then no need to write -'a' term
        int[] hashh = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashh[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter the number of character : ");
        int a = sc.nextInt();

        while (a-- > 0) {
            System.out.println("Enter a character:");
            char c = sc.next().charAt(0);

            System.out.println(hashh[c - 'a']);
        }
    }
}

/*
 * For example, if the character is 'a', s.charAt(i) - 'a' is 97 - 97 = 0.
 * 
 * If the character is 'b', s.charAt(i) - 'a' is 98 - 97 = 1.
 * 
 * Characters in Java are represented by their ASCII values.
 * The character 'a' has an ASCII value of 97, 'b' is 98, and so on up to 'z'
 * which is 122.
 * 
 */