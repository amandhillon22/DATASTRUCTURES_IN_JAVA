import java.util.*;


public class TREE_SET {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        ts.add(10);
        ts.add(30);
        ts.add(30);
        ts.add(3);
        ts.add(1);
        ts.add(29);
        ts.add(29);
        
        System.out.println(ts);
        System.out.println(ts.size());
    }
    
}
