import java.util.*;


public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(30);
        hs.add(10);
        hs.add(50);
        hs.add(80);
        hs.add(50);
        
        System.out.println(hs);
    }
    
}

// duplicate elements are eliminated in every category of Sets
// elements are arranged on the basis of hash codes, not asc or desc order.
