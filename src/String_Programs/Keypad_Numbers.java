
package String_Programs;

import java.util.*;
public class Keypad_Numbers {
    public static void main(String[] args) {
        String s="hello world";
        getNumbers(s);
    }
    
    static void getNumbers(String s)
    {
        String ans="";
        
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('a',1 );
        hm.put('b',1 );
        hm.put('c',1 );
        hm.put('d',2 );
        hm.put('e',2 );
        hm.put('f',2 );
        hm.put('g',3 );
        hm.put('h',3 );
        hm.put('i',3 );
        hm.put('j',4 );
        hm.put('k',4 );
        hm.put('l',4 );
        hm.put('m',5 );
        hm.put('n',5 );
        hm.put('o',5 );
        hm.put('p',6 );
        hm.put('q',6 );
        hm.put('r',6 );
        hm.put('s',6 );
        hm.put('t',7 );
        hm.put('u',7 );
        hm.put('v',7 );
        hm.put('w',8 );
        hm.put('x',8 );
        hm.put('y',8 );
        hm.put('z',8 );
        hm.put(' ',0 ); 
                
                for(int i=0; i<s.length();i++)
                {
                    char ch= s.charAt(i);
                    ans= ans+ hm.get(ch);
                }
                System.out.println(ans);
    }
}
