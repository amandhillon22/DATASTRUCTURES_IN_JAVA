import java.util.*;

public class PRIORITY_QUEUE {
    public static void main(String[] args) {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(6);
        pq.add(8);
        pq.add(2);
        pq.add(1);
        pq.add(4);
        pq.add(13);
        pq.add(7);
        
        System.out.println(pq);
        System.out.println(pq);
                
        pq.remove();
        System.out.println(pq);
    }
    
}
