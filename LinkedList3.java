public class LinkedList3 {
    //search(iterative)
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
        //search itr..
        public int itrSearch(int key){
            Node temp = head;
            int i =0;
            while(temp != null){
                if(temp.data == key){//key found
                return i;
            }
            temp = temp.next;
            i++;
            } //key not found.
            return -1;
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
        public int helper(Node head, int key){
            if(head == null){
                return -1;
            }
            if(head.data== key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head, key);
        }
        
    
    public static void main(String args[]){
        LinkedList3 ll = new LinkedList3();
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
         System.out.println(ll.itrSearch(3));
          
       
    }
}
