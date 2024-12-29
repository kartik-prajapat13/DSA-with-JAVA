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

public class insertionDeletion {

    public static void main(String[] args) {
        int[] arr = { 22, 5, 6, 8 };

        Node head = convertArr2LL(arr);
        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = deletion(head); // Perform deletion operation
        System.out.println("\nLinked List after Deletion:");
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

    // For performing deletion operation
    private static Node deletion(Node head) {
        if (head == null)
            return head; // Check if the list is empty

        Node temp = head; // Store the current head
        head = head.next; // Move head to the next node
        temp.next = null; // Help GC by removing references

        return head;
    }
}
