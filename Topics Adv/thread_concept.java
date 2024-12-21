// Thread is just run two function parallely  

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class thread_concept {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // Priority is from 1 to 10 (5 is default priority)
        System.out.println(obj1.getPriority());

        obj1.start();
        obj2.start();
    }

}
