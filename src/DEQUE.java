import java.util.*;


public class DEQUE {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        
        System.out.println(dq);
        
        dq.addFirst(40);
        dq.addFirst(50);
        
        System.out.println(dq);
        
        dq.removeFirst();
        System.out.println(dq);
        
         dq.removeLast();
        System.out.println(dq);
        
        
        
    }
    
}
