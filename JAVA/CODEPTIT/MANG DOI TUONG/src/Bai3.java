/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai3 {
    public static long prime(long n){
        long res=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                res=Math.max(i, res);
                while(n%i==0){
                    n/=i;
                }
            }
            
        }
        if(n!=1) res=Math.max(n, res);
        return res;
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(prime(n));
        }
    }
}
