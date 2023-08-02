
package String_Programs;

import java.util.*;

public class Short_Form {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        shortForm(s);
    }
    
    static void shortForm(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        
        int n= st.countTokens();
        for(int i=1; i<=n;i++)
        {
            String p=st.nextToken();
            char ch= p.charAt(0);
            ch=Character.toUpperCase(ch);
            System.out.print(ch+".");
        }
    }
    
}
