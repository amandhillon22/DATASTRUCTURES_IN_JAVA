import java.util.*;


public class ARRAYLIST_2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(true)
        {
            System.out.println("Enter the Numbers:");
            int num= scan.nextInt();
            
            if(num==0)
            {
                break;
            }
            al.add(num);
        }
        
        Collections.sort(al);
        System.out.println(al);
    }
    
}
