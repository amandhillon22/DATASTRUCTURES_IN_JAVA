import java.util.*;


public class MAPS {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        
        hm.put(113, "Aman");
        hm.put(23, "Lakshay");
        hm.put(1, "Shaina");
        hm.put(45,"Nitin");
        
        System.out.println(hm);
        
        System.out.println(hm.get(1));
    }
    
}

// same code for TreeMap and LinkedHashMap
// in HashMap the order will be random,
// in TreeMap there will be ascending order
// in LinkedhashMap there will be inserion order