import java.util.Scanner;

public class largestoddno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();


        String result = largestodd(num);
        System.out.println("Largest odd number: " + result);

       
        sc.close();
    }

   
    static String largestodd(String num) {
        // Loop from the last character to the first
        for (int i = num.length() - 1; i >= 0; i--) {
            
            if ((num.charAt(i) - '0') % 2 != 0) {   //
                // Return the substring from the start to the current odd character
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}
