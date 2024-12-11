package J07006;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> LIST = (ArrayList<Integer>) sc.readObject();
        Map<Integer,Integer> mp = new TreeMap<>();
        for (int num:LIST){
            mp.put(num,mp.getOrDefault(num, 0)+1);
        }
        for ( Integer key : mp.keySet()){
            System.out.println(key +" "+ mp.get(key));
        }
        
    }
    
}
