import java.util.*;


public class Linked_List {
    public static void main(String[] args) {
          LinkedList<Integer> ll = new LinkedList<>();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        
        ll.addFirst(40);
        ll.add(50);
        ll.addLast(60);
        ll.add(70);
        ll.add(3,34);
        
        System.out.println(ll);
    }
    
}

// the name of the class and the name of the package should not be the same
// for eg. LinkedList package is imported in java.util statement, so 
// the name of the should be anything diff. here like i have changed i.e Linked_List

//insertion order is followed in LinkedList


