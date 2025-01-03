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

public class ReverseDLL {

    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 60, 70, 90, 100};

        Node head = convertArr2DLL(arr);
        System.out.println("Original DLL:");
        printLinkedList(head);

        System.out.println("\nReversed DLL:");
        head = reverseDLL(head);
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head; // Return as is if the list is empty or has only one node
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            // Swap next and back pointers
            prev = current.back;
            current.back = current.next;
            current.next = prev;

            // Move to the next node (which is current.back after swap)
            current = current.back;
        }

        // New head is the previous node (last processed node)
        return prev.back;
    }
}
