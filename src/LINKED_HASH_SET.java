import java.util.*;


public class LINKED_HASH_SET {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
        
        lhs.add(23);
        lhs.add(22);
        lhs.add(30);
        lhs.add(2);
        lhs.add(2);
        lhs.add(23);
        
        System.out.println(lhs);
        
        System.out.println(lhs.contains(23));
    }
    
}

// no duplicates
// no asc desc but maintains insertion order