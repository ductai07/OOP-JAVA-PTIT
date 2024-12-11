package VAO_RA_FILE_NP;
import java.io.*;
import java.util.*;
import java.math.*;

public class Bai3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> list1 = (ArrayList<String>) in.readObject();
        TreeSet<String> set1 = new TreeSet<>();
        for(String x:list1){
            set1.add(x);
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(Integer x:list2){
            set2.add(x);
        }
        for(String x1:set1){
            for(Integer x2:set2){
                System.out.println(x1+x2);
            }
        }
    }
}
