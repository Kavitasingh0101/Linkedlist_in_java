//Search for a key in a linkedlist.Return the position whwre it is found.if not found,then return -1.

public class search_in_linkedlist {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

    Node head;
    Node tail;

    public void addlast(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // method for search key in linkedlist
    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }

        // key is not found
        return -1;
    }

    public static void main(String[] args) {
        search_in_linkedlist sl = new search_in_linkedlist();
        sl.addlast(1);
        sl.addlast(4);
        sl.addlast(6);
        sl.addlast(8);
        sl.addlast(9);

        sl.print();
        System.out.println();
        System.out.println(sl.search(6));  //this return index 2.
        System.out.println(sl.search(7));  // element 7 is not present in the linkedlist so this return -1.

    }

}
