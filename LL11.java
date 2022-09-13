public class LL11 {
    

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node left = head;
        Node right= prev;
        Node nextL, nextR;
        //alt merge --> zigzag
        while(left != null && right!= null){
            nextL = left.next;
            left.next = right;
            nextR= right.next;
            right.next=nextL;
            left = nextL;
            right = nextR;
        }
    }
    //method for addLast
    public void addlast(int data){
        //step1 create new node
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 newNode  next = head
        tail.next = newNode;
        //step3 head = newNode
        tail = newNode;

    }
     //method for print
     public static void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data +" -->");
            temp = temp.next;
        }System.out.println("null");
    }
    public static void main(String[] args) {
        LL11 ll = new LL11();
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(3);
       ll.addlast(4);
       ll.addlast(5);
       print();
       ll.zigzag();
       print ();


    }

}