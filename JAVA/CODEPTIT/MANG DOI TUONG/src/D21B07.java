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
public class D21B07 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String> ) obj.readObject();
        Map<String,Long> mp = new HashMap<>();
        for(String s : list){
            String tmp = "";
            long res =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0' || s.charAt(i)=='1') tmp+=s.charAt(i);
            }
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i)=='1') res += Math.pow(2, tmp.length()-i-1);
            }
            mp.put(tmp,res);
            
        }
        for( String key : mp.keySet()){
            System.out.println(key +" "+mp.get(key));
        }
        
    }
}
//10101 
