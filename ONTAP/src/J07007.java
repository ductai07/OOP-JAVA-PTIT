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
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> st = new HashSet<>();
        while(sc.hasNext()){
            String s =sc.next().toLowerCase();
            st.add(s);
        }
        for(String vl : st){
            System.out.println(vl);
        }
    }   
}
