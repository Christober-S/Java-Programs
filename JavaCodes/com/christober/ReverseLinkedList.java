package christober;// Reverse Linked List in Java (Iterative + Recursive)

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    Node head;

    // ------------------ ITERATIVE METHOD ------------------
    Node reverseIterative() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;    // Store next node
            current.next = prev;    // Reverse the link
            prev = current;         // Move prev one step forward
            current = next;         // Move current one step forward
        }

        head = prev; // New head of the reversed list
        return head;
    }

    // ------------------ PRINT LINKED LIST ------------------
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // ------------------ MAIN METHOD ------------------
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> null
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.listPrinter();

        // Reverse Iteratively
        list.reverseIterative();
        System.out.println("\nReversed Linked List (Iterative):");
        list.listPrinter();
    }

    // Helper method to print from head
    void listPrinter() {
        printList(head);
    }
}
