public class LinkedList1{
    //removeFirst, removeLast.
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
        static int size=1 ;
        //method for remove first.
        public int removeFirst(){
            if(size ==0){
                System.out.println("LL is empty.");
                return Integer.MIN_VALUE;
            }
            else if(size ==1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;

        }
        //method for removeLast.
        public int removeLast(){
            if(size==0){
                System.out.println("LL is empty.");
                return Integer.MIN_VALUE;
            }
            else if(size ==1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            //prev : i = size-2
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }
            int val = tail.data;
            tail = null;
            tail = prev ;
            size--;
            return val;
        }
        //method for addFirst
        public void addFirst(int data){
            //step1 create new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            //step2 newNode  next = head
            newNode.next = head;
            //step3 head = newNode
            head = newNode;

        }
        //method for addLast
        public void addlast(int data){
            //step1 create new node
            Node newNode = new Node(data);
            size++;
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
        public void print(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data +" -->");
                temp = temp.next;
            }System.out.println("null");
        }
        //method for adding in the middle.
        public void add(int idx, int data){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;   //track temp's idx
            while(i< idx-1){
                temp = temp.next;
                i++;
               
            } newNode.next = temp.next;
            temp.next=newNode;
        }
        
    
    public static void main(String args[]){
        LinkedList1 ll = new LinkedList1();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addlast(3);
        // ll.print();
        ll.addlast(4);
        // ll.print();
        ll.add(2,9);
         ll.print();
          
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(LinkedList1.size);


    }
    
}

