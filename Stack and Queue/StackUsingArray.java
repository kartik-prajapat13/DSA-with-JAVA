import java.util.*;

public class StackUsingArray {
    public static void main(String[] args) {

        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Top of element :" + s.top());
        System.out.println("Size of element : " + s.size());
        System.out.println("Removed element is : " + s.pop());
        System.out.println("Size of element : " + s.size());
        System.out.println("TOp of element : " + s.top());

    }

}

class stack {

    int size = 5;

    int[] arr = new int[size];

    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int top() {

        return arr[top];
    }

    int size() {
        return top + 1;
    }

}
