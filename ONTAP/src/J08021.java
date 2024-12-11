/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            String s = sc.next();
            int m=0;
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)=='(') st.push(i);
                else{
                    st.pop();
                    if(!st.isEmpty()){
                        
                        m=Math.max(m,k-st.peek());
                    }
                    else st.push(k);
                }
                
            }
            System.out.println(m);
                
            
        }
    }
    
}
