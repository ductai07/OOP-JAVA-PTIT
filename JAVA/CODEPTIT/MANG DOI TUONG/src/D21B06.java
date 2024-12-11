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
public class D21B06 {
    public static int check(int n){
        String s = String.valueOf(n);
        if(s.length()%2==0 || s.length()<=1) return 0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0) return 0;
        }
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return 0;
            l++;r--;
        }
        return 1;
    }
        
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) obj2.readObject();
        int[] cnt1 = new int[1000005];
        int[] cnt2 = new int[1000005];
        for (Integer x : list1) {
            if (check(x)==1)
                cnt1[x]++;
        }
        for (Integer x : list2) {
            if (check(x)==1)
                cnt2[x]++;
        }
        int dem = 0;
        for (int i = 10; i <= 1000004; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                dem++;
                if (dem == 10) break;
            }
        }
        
        
    }
}
