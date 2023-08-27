
package String_Programs;

import java.util.*;
public class Word_Frequency_Black_n_Green_Question_2022 {
    public static void main(String[] args) {
        String s="Aman Dhillon";
        String answer= wordFrequency(s);
    }
    
    static String wordFrequency(String s)
    {
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        
        int i, l=s.length();
        String ans="";
        
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(lhm.get(ch)==null)
            {
                lhm.put(ch, 1);
            }
            else
            {
                int val=lhm.get(ch);
                val=val+1;
                lhm.put(ch, val);
            }
        }
        
        Set<Character> keys= lhm.keySet();
        
        for(char c:keys)
        {
            System.out.println(c + " " + lhm.get(c));
            ans= ans+lhm.get(c);
        }
        return ans;
    }
}
