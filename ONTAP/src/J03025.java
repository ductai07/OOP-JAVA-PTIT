/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            String s = sc.next();
            int l=0,r=s.length()-1;
            int cnt=0;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)) cnt++;
                l++;r--;
            }
            if((cnt==1)|| (cnt==0 && (int)s.length() %2!=0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
