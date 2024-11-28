package DSA.recursion;

public class LinkedList {
    class Node{
        int val;
        Node next;
        public Node(int  val){
            this.val=val;

        }

    }
     static Node head=null;  Node tail=null;
    public  void addNodeAtEnd(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            tail.next=newNode;
            newNode.next=null;
            tail=newNode;
        }


    }
    public  void addNodeAtBegining(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
          newNode.next=head;
          head=newNode;
        }


    }
    public void addNodeAtIndex(int val,int n){

        int count=1;
        Node currentnode=head;
        while((currentnode!=null)&&(count!=n-1)){
            currentnode=currentnode.next;
            count++;
        }
        Node newNode=new Node(val);
        Node temp=currentnode.next;
        currentnode.next=newNode;
        newNode.next=temp;

    }
    public void deleteNodeAtEnd(){
        Node currentNode=head;
        while (currentNode.next.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        tail=currentNode;
    }
    public void deleteNodeAtBegining(){
        head=head.next;
    }
    public void deleteNodeAtIndex(int index){
        Node currentNode=head;
        int count=1;
        while((currentNode!=null)&&(count!=index-1)){
            currentNode=currentNode.next;
            count++;
        }
        currentNode.next=currentNode.next.next;

    }
    public void deleteNode(int val){
        if(head.val==val){
            deleteNodeAtBegining();
        } else if (tail.val==val) {
            deleteNodeAtEnd();

        }else{

        }

    }
    public void printLinkedList(Node headNode){
         Node currentnode=headNode;
         while(currentnode!=null){
             System.out.println(currentnode.val);
             currentnode=currentnode.next;

         }
    }


    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addNodeAtBegining(10);
        linkedList.addNodeAtBegining(20);
        linkedList.addNodeAtBegining(30);
        linkedList.addNodeAtBegining(40);
        new LinkedList().printLinkedList(head);
        new LinkedList().addNodeAtIndex(75,3);
        new LinkedList().printLinkedList(head);
        new LinkedList().deleteNodeAtEnd();
        new LinkedList().printLinkedList(head);
        new LinkedList().deleteNodeAtBegining();
        new LinkedList().printLinkedList(head);
        new LinkedList().deleteNodeAtIndex(3);
        new LinkedList().printLinkedList(head);

    }
}
