package christober.learning.collection.linkedlistpgm;

public class CreatingLinkedList {
    static void main() {
        Node head = new Node(1); // Create first node
        head.appendToTail(2);    // List: 1 → 2
        head.appendToTail(3);    // List: 1 → 2 → 3
        head.appendToTail(2);    // List: 1 → 2 → 3 → 2 (with duplicate)
        head.appendToTail(4);    // List: 1 → 2 → 3 → 2 → 4
        head.appendToTail(1);    // List: 1 → 2 → 3 → 2 → 4 → 1 (with duplicates)
        printList(head);
    }
    // Method to iterate and print the linked list
    static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
class Node{
    Node next = null;
    int data;
    public Node(int d){
        data = d;
    }
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
