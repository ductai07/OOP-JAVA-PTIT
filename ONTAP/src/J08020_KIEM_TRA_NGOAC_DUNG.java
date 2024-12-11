/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J08020_KIEM_TRA_NGOAC_DUNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') st.push(s.charAt(i));
                else if(!st.isEmpty() && (( st.peek()=='[' && s.charAt(i)==']') || ( st.peek()=='{' && s.charAt(i)=='}') || ( st.peek()=='(' && s.charAt(i)==')'))){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
