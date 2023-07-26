import java.util.*;

public class SIMPLE_QUEUE {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> q= new ArrayDeque<>();
        
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        q.addLast(40);
        q.addLast(50);
        
        System.out.println(q);
        
        q.removeFirst();
        System.out.println(q);
    }
    
}
// ArrayDeque can act a simple queue when we add elemenrs from one side and remove elements from other side
