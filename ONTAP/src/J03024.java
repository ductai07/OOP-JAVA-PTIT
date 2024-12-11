/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J03024 {
    public static int check(String s){
        int cntc=0,cntl=0,cnt=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return -1;
            if((s.charAt(i)-'0')%2==0) cntc++;
            else cntl++;
            cnt++;
            
        }
        if((cntc<cntl && cnt%2==1) || (cntl<cntc && cnt%2==0)) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else if(check(s)==0) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999