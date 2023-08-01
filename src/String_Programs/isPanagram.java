import java.util.*;


public class isPanagram {
    public static void main(String[] args) {
        String s= "abcdefghijklmnopqrstuvwxyZ";
        System.out.println(isPanagram(s));
    }
    
    static boolean isPanagram(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        
        for (int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if((ch>='a'&&ch<='z') || (ch>='A'&& ch<='Z'))  //ch.isLetter()  --> chhote vadde dove chakk lenda hai
            {
                hs.add(ch);
            }
        }
        return (hs.size()==26);
    }
}
