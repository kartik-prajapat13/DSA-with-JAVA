import javax.sound.midi.Soundbank;

public class Pattern2 {

    public static void main(String[] args) {
        pattern(5);
        invertpattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // --------- Inverse Pattern ---------------

    static void invertpattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
 ********* 
 * 
 * (Space , star , space) -> (0,9,0)
 ******* (Space , star , space) -> (1,7,1)
 *****
 ***
 *
 * 
 */