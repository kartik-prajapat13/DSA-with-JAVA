import java.util.*;

class A {

    public void inshow() {
        System.out.println("A in show");
    }
}

class B extends A {

    @Override
    public void inshow() {
        System.out.println("B in show");
    }
}

public class annotation_learn {
    public static void main(String[] args) {

        B obj = new B();
        obj.inshow();
    }
}
