/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            String s = sc.next();
            long sum=0;
            List<Character> a = new ArrayList<>();
            for(int j=0;j<s.length();j++){
                if(!Character.isDigit(s.charAt(j))) a.add(s.charAt(j));
                else {
                    sum+=s.charAt(j)-'0';
                }
            }
            Collections.sort(a);
            for(Character ch:a){
                System.out.print(ch);
            }
            System.out.println(sum);
        }
    }
    
}
