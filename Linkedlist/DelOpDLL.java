
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

public class DelOpDLL {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 60, 70 };

        Node head = convertArr2DLL(arr);
        printlinkedlist(head);
        System.out.println();

        System.out.print("After Deleting the tail : ");

        head = DelTail(head);
        printlinkedlist(head);

        System.out.println();

        System.out.print("After Deleting the Head: ");
        head = DelHead(head);
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

    private static Node DelTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        Node newtail = tail.back;

        newtail.next = null;
        tail.back = null;

        return head;
    }

    private static Node DelHead(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;

        prev.next = null;
        head.back = null;

        return head;
    }

}
