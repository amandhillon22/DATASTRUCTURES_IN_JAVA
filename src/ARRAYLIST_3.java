import java.util.*;


public class ARRAYLIST_3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        ArrayList<String> al= new ArrayList<>();
        
        System.out.println("Enter Name:");
        
        while(true)
        {
            String name= scan.nextLine();
            
            if(name.equals(""))
            {
                break;
            }
            
            al.add(name);
        }
        Collections.sort(al,Collections.reverseOrder());
        
        System.out.println(al);
    }
    
}
