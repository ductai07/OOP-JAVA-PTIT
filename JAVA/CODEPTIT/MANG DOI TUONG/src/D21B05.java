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
public class D21B05 {
    public static int check(int n){
        if(n<10) return 0;
        while(n>0){
            if((n%10)<((n/10)%10)) return 0;
            n/=10;
        }
        return 1;
    }
    public static void main(String[] args ) throws  IOException,ClassNotFoundException{
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> list1 = (ArrayList<Integer> )obj1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer> )obj2.readObject();
        Map<Integer,Integer> mp1 = new TreeMap<>();
        Map<Integer,Integer> mp2 = new TreeMap<>();
        
        for(Integer num : list1){
            if(check(num)==1){
                mp1.put(num, mp1.getOrDefault(num, 0)+1);
            }
        }
        for(Integer num:list2){
            if(check(num)==1 && mp1.containsKey(num)){
                mp2.put(num,mp2.getOrDefault(num, 0)+1);
            }
        }
        for(Integer m : mp1.keySet()){
            System.out.println(m+" "+mp1.get(m)+" "+mp2.get(m));
        }

    }
}
