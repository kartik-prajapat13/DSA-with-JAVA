import java.rmi.StubNotFoundException;

public class QueueUsingArray {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        System.out.println("The size of the element is : " + q.size());
        System.out.println(q.pop());// pop 10
        System.out.println("The size of the element is : " + q.size());
        System.out.println(q.pop());// pop 20

        System.out.println("Top element of queue is : " + q.top());
        System.out.println("The size of the element is : " + q.size());

    }
}

class Queue {

    int size = 5;
    int arr[] = new int[size];

    int currsize;
    int start = -1;
    int end = -1;

    void push(int x) {
        if (currsize == size) {
            System.out.println("Queue is full");
        }
        if (currsize == 0) { // Queue is empty
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size; // Only end will move to the END

        }
        arr[end] = x;
        currsize += 1;

    }

    int pop() {
        if (currsize == 0) {
            return -1;
        }

        int value = arr[start];
        start = (start + 1) % size;
        currsize = -1;
        return value;
    }

    int top() {
        if (start == -1) {
            System.out.println("Queue is empty");
        }
        return arr[start];
    }

    int size() {
        return currsize;
    }
}

/*
 * Without Circular Logic (Linear Queue):
 * 
 * If end = 9 and you add an element, end + 1 = 10.
 * Index 10 is out of bounds, causing an error.
 * With Circular Logic (Circular Queue):
 * 
 * (end + 1) % size = (9 + 1) % 10 = 0.
 * Now end becomes 0, indicating that the next element will be added at the
 * start of the array.
 */