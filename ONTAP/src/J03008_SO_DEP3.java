/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J03008_SO_DEP3 {
    public static int check(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if(sb.toString().compareTo(s)!=0) return 0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='2'&& sb.charAt(i)!='5' && sb.charAt(i)!='7' && sb.charAt(i)!='3' ) return 0;
         
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
            String s =sc.nextLine();
            if(check(s)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//3
//123456787654321
//235755557532
//2222333355557777235775327777555533332222