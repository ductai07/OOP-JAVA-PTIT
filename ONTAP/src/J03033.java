/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=1;i<=t;i++){
            BigInteger a = sc.nextBigInteger();
            BigInteger b =sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            System.out.println((a.multiply(b).divide(ucln)));
        }
    }
}
