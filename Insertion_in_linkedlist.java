public class insertion {
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

    public void addlast(int d){
        Node newNode = new Node(d);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void addAtMiddle(int idx,int d){
        Node newNode = new Node(d);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;


        }
        newNode.next=temp.next;
        temp.next=newNode;
    }


    public static void main(String[] args) {
        insertion ll = new insertion();
        ll.firstadd(6);
        ll.firstadd(8);
        
        ll.addlast(9);
        ll.addAtMiddle(1, 2);
        ll.print();


    }
    
}
