import java.util.*;


public class printFrequency {
    public static void main(String[] args) {
        String s= "Hello How Are You";
       printFrequency(s);
    }
    
    static void printFrequency(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
            }
            else
            {
                int val= hm.get(ch);
                val++;
                hm.put(ch,val);
            }
            
        }
        System.out.println(hm);
        
        Set<Character> set1 =hm.keySet();
        for(char c: set1)
        {
            System.out.println(c+"--"+hm.get(c));
        }
    }
    
}
