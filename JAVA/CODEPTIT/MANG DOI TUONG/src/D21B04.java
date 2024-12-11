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
public class D21B04 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("C:\\Users\\ASUS\\Desktop\\JAVA\\CODEPTIT\\Xinchao\\src\\DATA.in"));
        ArrayList<String> list = (ArrayList<String>) obj.readObject();
        Set<Integer> st = new TreeSet<>();
        for(String s:list){
            String[] tokens = s.split("\\s+");
            for(String tok :tokens){
                try{
                    int num = Integer.parseInt(tok);
                    st.add(num);
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
