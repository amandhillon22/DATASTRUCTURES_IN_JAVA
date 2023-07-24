import java.util.*;


public class REVERSE_A_STACK {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        Stack<String> st = new Stack<>();
        
        while(true)
        {
            System.out.println("Enter Your Name:");
            String s= scan.nextLine();
            
            if(s.equals(""))
            {
                break;
            }
            st.push(s);
//            System.out.println(st);
            break;
        }
        
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    
}
