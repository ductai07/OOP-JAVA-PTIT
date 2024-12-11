import java.io.*;
import java.util.*;

public class J07004_So_khac_nhau_FILE {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.IN")));
       Map<Integer, Integer> mp = new TreeMap<>();
       while(obj.hasInt()){
           int n = obj.nextInt();
           mp.put(n, mp.getOrDefault(n, 0) + 1);
       }
       for (Integer key : mp.keySet()) {
            System.out.println(key + " " + mp.get(key));
        }
    
    }