public class LL {

    Node head;

    class Node{
        int data;
        Node next;


        Node(int data ){
            this.data=data;
            this.next =null;
        }

    }

    // add first

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!= null){
            currNode =currNode.next;
        }
        currNode.next=newNode;

    }

    // print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ "->");
            currNode =currNode.next;
        }
        System.out.println("null");

    }

    // delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }

    // delete last
    public void deletelast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast =head;
        Node lastNode=head.next;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next= null;

    }
    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);

        list.printList();

        list.addLast(11);
        list.addLast(12);

        list.printList();

        list.addLast(17);

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deletelast();
        list.printList();

    }
}
