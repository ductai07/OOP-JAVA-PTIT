package BAITHUCHANH2;

import java.util.*;
import java.io.*;

public class BaiF {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list= (ArrayList<String>) obj.readObject();
        Set<Integer> st = new TreeSet<>();
        for(String s:list){
            String[] tokens= s.split("\\s++");
            for(String token:tokens){
                try{
                    int n = Integer.parseInt(token);
                    st.add(n);
                }
                catch(NumberFormatException e){

                }
            }
        }
        for(int num:st){
            System.out.println(num);
        }
    }
}