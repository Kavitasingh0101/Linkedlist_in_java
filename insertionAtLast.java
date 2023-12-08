import java.util.LinkedList;

public class insertionAtLast {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Implementation of insertion of a node

    public void insertAtEnd(int newdata) {
        Node newnode = new Node(newdata);

        // if linkedlist is empty

        if (head == null) {
            head = newnode;
            return;
        }

        // linkedlist is not empty

        newnode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newnode;
        return;
    }

    // Displaying the linkedlist

    public void displayLL() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        insertionAtLast ll = new insertionAtLast();

        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        System.out.println("Previous linkedlist before insertion of 2");
        ll.displayLL();
        System.out.println();
        ll.insertAtEnd(2);
        System.out.println("Linked after after insertion of 2");
        ll.displayLL();

    }

}
