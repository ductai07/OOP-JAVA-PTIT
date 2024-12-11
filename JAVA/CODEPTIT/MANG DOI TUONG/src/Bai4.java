/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
 
import java.util.*;
public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            long tich = 1;
            long tong = 0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    if(s.charAt(i)!='0') tich*= s.charAt(i)-'0';
                }
                else tong += s.charAt(i)-'0';
            }
            System.out.println(tich+" "+tong);
            
        }
    }
}
