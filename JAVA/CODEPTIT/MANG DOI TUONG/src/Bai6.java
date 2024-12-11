/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai6 {
    public static String cach1(String s){
        String[]  tokens = s.toLowerCase().trim().split("\\s+");
        String res=Character.toUpperCase(tokens[tokens.length-1].charAt(0)) + tokens[tokens.length-1].substring(1)+" ";
        
        for(int i=0;i<tokens.length-1;i++){
            res+= Character.toUpperCase(tokens[i].charAt(0))+tokens[i].substring(1)+" ";
        }
        return res.trim();
        
    }
    public static String cach2(String s){
        String[]  tokens = s.toLowerCase().trim().split("\\s+");
        String res=Character.toUpperCase(tokens[0].charAt(0)) + tokens[0].substring(1);
        String tmp="";
        for(int i=1;i<tokens.length;i++){
            tmp+= Character.toUpperCase(tokens[i].charAt(0))+tokens[i].substring(1)+" ";
        }
        return tmp+res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if(n==1) System.out.println(cach1(s));
            else System.out.println(cach2(s));
        }
    }
}
