public class TraversalLinkedlist {

    static class Node { // Marked as static for accessibility
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

    public static void main(String[] args) {

        int[] arr = { 2, 4, 3, 5 };

        Node head = convertArr2LL(arr);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Length of LL : " + Lengthcnt(head));

        System.out.println(elementfind(head, 2));
    }

    // Checking the element is present in LL or not

    private static int elementfind(Node head, int target) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return 1;
            }
            temp = temp.next; // Move to the next node
        }
        return 0;

    }

    // Length of the LL
    private static int Lengthcnt(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;

    }

    // Converting ARRAY to LL

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0], null);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
