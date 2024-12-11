/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<String> st = new Stack<>();
            String s = sc.nextLine();
            String[] tokens = s.split("\\s+");
            for(String tmp: tokens){
                st.push(tmp);
            }
            while(!st.isEmpty()){
                System.out.print(st.peek() +" ");
                st.pop();
            }
            System.out.println();
        }
    }
    
}
