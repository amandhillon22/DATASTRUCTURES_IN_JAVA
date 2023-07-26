
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amanj
 */
public class STACK {
    public static void main(String[] args) {
        
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        System.out.println(st);
       
        
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    
}
