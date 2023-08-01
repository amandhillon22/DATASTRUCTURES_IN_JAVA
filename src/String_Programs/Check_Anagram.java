
package String_Programs;

import java.util.*;



public class Check_Anagram {
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "bac";
        
        System.out.println(checkAnagram(s1,s2));
    }
    
    static boolean checkAnagram(String s1, String s2)
    {
        char a[]= s1.toCharArray();
        char b[]= s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}
//Aptitude Quess: 
//Critical and Logical Reasoning
// series
//coding decoding
//para jumbles
//pseudocodes
//ms office
//networking
//blood relation
//directions
//seating arrangement
