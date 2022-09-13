import java.util.LinkedList;
public class LLcollfrmwrk {
   public static void main(String[] args) {
    //create LL
    LinkedList<Integer> ll = new LinkedList<>();
    //add nodes
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    System.out.println(ll);
    //remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);

   } 
}
