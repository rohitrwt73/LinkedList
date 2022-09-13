public class LinkedList7 {
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
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public boolean isPalindrome(){
            if(head == null || head.next == null){
                return true;
            }
            //step 1 find midNode
             Node midNode = findMid(head);
             //step2 reverse 2nd half
             Node prev = null;
             Node curr = midNode;
             Node next;
             while(curr!= null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
             }
             Node right = prev;   //right half head
             Node left = head;
             //step 3 check if 1st half is equal to 2nd half
             while(right != null){
                if(left.data!= right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
             }return true;
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

        public static void main(String args[]){
            LinkedList7 ll = new LinkedList7();
            // ll.print();
            ll.addlast(1);
            // ll.print();
            ll.addlast(2);
            // ll.print();
            ll.addlast(2);
            // ll.print();
            ll.addlast(1);
             ll.print();
             System.out.println(ll.isPalindrome());
}
}
