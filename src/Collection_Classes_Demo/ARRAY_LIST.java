import java.util.*;


public class ARRAY_LIST {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        System.out.println(al);
        
        al.remove(3);
        
        System.out.println(al);
        System.out.println(al.size());
        
    }
    
}
