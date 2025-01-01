
class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;

    }
}

public class DoublyLinkedlist {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 60, 70 };

        Node head = convertArr2DLL(arr);
        printlinkedlist(head);

    }

    private static void printlinkedlist(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node convertArr2DLL(int[] arr) {

        Node head = new Node(arr[0]);

        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
