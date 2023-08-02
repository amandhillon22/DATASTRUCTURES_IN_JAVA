
package String_Programs;

import java.util.*;

public class Convert_To_Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        initials(s);
    }
    
    static void initials(String s)
    {
        StringTokenizer st= new StringTokenizer(s);
        int n= st.countTokens();
        
        for(int i=1;i<=n-1;i++)
        {
            String p= st.nextToken();
            char ch= p.charAt(0);
            ch=Character.toUpperCase(ch);
            System.out.print(ch+". ");
        }
        
        String last= st.nextToken();
        char fc=last.charAt(0);
        fc=Character.toUpperCase(fc);
        String sub=last.substring(1);
        sub.toLowerCase();
        System.out.print(fc+sub);
        
    }
}
