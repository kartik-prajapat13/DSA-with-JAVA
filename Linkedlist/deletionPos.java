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

public class deletionPos {

    public static void main(String[] args) {
        int[] arr = { 22, 5, 6, 8, 9 };

        Node head = convertArr2LL(arr);
        System.out.println("Original Linked List:");
        printLinkedList(head);

        System.out.println();

        head = removenode(head, 3);
        System.out.println("After deletion : ");
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

    private static Node removenode(Node head, int k) {
        if (head == null)
            return head;

        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

}
