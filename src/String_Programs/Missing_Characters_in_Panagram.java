
package String_Programs;

import java.util.*;

public class Missing_Characters_in_Panagram {
    public static void main(String[] args) {
        String s= "the quick brown frog jumps over the lazy dg";
        missingCharacter(s);
    }
    
    static void missingCharacter(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(!hm.containsKey(ch))
            {
                hm.put(ch, 1);
            }
            else
            {
                int val= hm.get(ch);
                val++;
                hm.put(ch,val);
            }
        }
        System.out.println(hm);
        
        for(ch='a';ch<='z';ch++)
        {
            if(hm.get(ch)==null)
            {
                System.out.println(ch+ " is Missing");
            }
        }
    }
}
