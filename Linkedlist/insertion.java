class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class insertion {

    public static void main(String[] args) {
        int[] arr = { 22, 5, 6, 8, 9 };

        Node head = convertArr2LL(arr);
        System.out.println("Original Linked List:");
        printLinkedList(head);

        System.out.println();
        head = inserthead(head, 20);
        printLinkedList(head);

        System.out.println();
        head = inserttail(head, 90);
        printLinkedList(head);

        System.out.println();
        head = insertAtK(head, 40, 3);
        printLinkedList(head);

    }

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // For printing the linked list
    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static Node inserthead(Node head, int val) {

        Node temp = new Node(val, head);
        return temp;

    }

    private static Node inserttail(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Create a new node and attach it to the last node
        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }

    private static Node insertAtK(Node head, int val, int k) {
        Node newNode = new Node(val);

        // Case 1: Inserting at the head
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to the (k-1)-th node
        Node temp = head;
        int cnt = 1;

        while (temp != null && cnt < k - 1) {

            temp = temp.next;
            cnt++;

        }
        // If k is out of bounds, return the original list
        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

}
