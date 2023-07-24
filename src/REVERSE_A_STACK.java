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
                System.out.println("Enter Something");
                break;
            }
            else
            {
               st.push(s);
               System.out.println(st);
            }
        }
        
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    
}

//In this case, the user enters three names ("John Doe," "Alice," and "Bob"). 
//The program pushes each name into the stack and prints the
//current state of the stack after each push. 
//When the user presses Enter without entering any name, the loop breaks,
//and then the program proceeds to the second loop, where
//it pops and prints the elements from the stack in reverse order, 
//resulting in "Bob," "Alice," and "John Doe" being printed.



//    String a="a";
//        String m="m";
//        String r="r";
//        String t="t";
//        
//        Stack<String> st2= new Stack<>();
//        st2.push(a);
//        st2.push(m);
//        st2.push(r);
//        st2.push(t);