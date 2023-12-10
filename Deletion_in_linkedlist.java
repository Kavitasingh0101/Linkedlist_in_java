public class Deletion_in_linkedlist {
    class Node{
        int data;
        Node next;


        Node(int d){
            data=d;
            next=null;

        }
    }
    Node head;
    Node tail;

    public void firstadd(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = tail = newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
            temp=tail;
    }
    public static void main(String[] args) {
        Deletion_in_linkedlist ll = new Deletion_in_linkedlist();
        ll.firstadd(6);
        ll.firstadd(5);
        ll.firstadd(4);
        ll.firstadd(3);
        ll.firstadd(2);
        ll.firstadd(1);
        
        ll.print();
        System.out.println();
        System.out.println("After deleting the first node");
        ll.removeFirst();
        ll.print();
        System.out.println();
        System.out.println("After deleting the last node");
        ll.removeLast();
        ll.print();



    }

    
}
