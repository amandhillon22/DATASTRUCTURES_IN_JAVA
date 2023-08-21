
package String_Programs;

import java.util.*;
public class Every_Possible_Unique_Substring {
    public static void main(String[] args) {
        String s="AmanAman";
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        for(int i=1;i<=s.length();i++)
        {
            everyUniqueSubstring(s,i,lhs);   
        }      
        System.out.println(lhs);
    }
    
    static void everyUniqueSubstring(String s, int k, LinkedHashSet<String> lhs)
    {
        int l= s.length();
        String sub;
        
        for(int i=0;i<=l-k;i++)
        {
            sub=s.substring(i,i+k);
            lhs.add(sub);           
        }
    }
}
