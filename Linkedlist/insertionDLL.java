
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

public class insertionDLL {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 60, 70 };

        Node head = convertArr2DLL(arr);
        printlinkedlist(head);

        System.out.println();
        System.out.print("Inserting at tail : ");
        head = insertAtTail(head, 80);
        printlinkedlist(head);

        System.out.println();
        System.out.print("Inserting at Head : ");
        head = insertAtHead(head, 5);
        printlinkedlist(head);

        System.out.println();
        System.out.print("Inserting at k : ");
        head = insertAtK(head, 3, 40);
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

    private static Node insertAtTail(Node head, int k) {

        Node newNode = new Node(k);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.back = current;

        return head;
    }

    private static Node insertAtHead(Node head, int k) {

        Node newNode = new Node(k);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        newNode.back = null;
        head.back = newNode;

        return newNode;

    }

    private static Node insertAtK(Node head, int k, int val) {
        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }

        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);

        prev.next = newNode;
        temp.back = newNode;

        return head;

    }

}
