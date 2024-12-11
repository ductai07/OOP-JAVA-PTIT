/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class D21B02 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Desktop\\JAVA\\CODEPTIT\\Xinchao\\src\\DATA.in"));
        Set<BigInteger> st = new HashSet<>();
        BigInteger tong= BigInteger.ZERO;
        BigInteger tich= BigInteger.ONE;
        while(sc.hasNext()){
            BigInteger x = sc.nextBigInteger();
            st.add(x);
        }
        for(BigInteger tmp:st){
//            System.out.println(tmp);
            tich = tich.multiply(tmp);
            tong = tong.add(tmp);
        }
        System.out.println(tong);
        System.out.println(tich);
    }
}
