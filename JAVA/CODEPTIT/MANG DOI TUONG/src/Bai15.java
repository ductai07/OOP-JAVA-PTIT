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
public class Bai15 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String token = sc.next();
            try {
                        long num = Long.parseLong(token);
                        if (num > Integer.MAX_VALUE && num <= Long.MAX_VALUE) {
                            sum += num;
                        }
             } 
            catch (NumberFormatException e) {
                         
            }
        }
        System.out.println(sum);
        
        
        
        
    }
}
