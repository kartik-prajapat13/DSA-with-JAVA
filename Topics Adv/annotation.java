import java.util.*;

public class annotation {

    public class A {

        public void Ainshow() {
            System.out.println("A in show");
        }
    }

    public class B extends A {

        public void Binshow() {
            System.out.println("B in show");
        }
    }

    public class demo {

        public static void main(String[] args) {
            c obj = new c();
            obj.Binshow();
        }
    }
}
