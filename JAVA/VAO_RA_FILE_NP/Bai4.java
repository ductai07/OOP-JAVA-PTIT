package VAO_RA_FILE_NP;

import java.io.*;
import java.util.*;

public class Bai4 {
    public static boolean check(int n){
        if(n <2) return false;
        for(int i=2; i <=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        for(Integer x : list){
            set.add(x);
        }
        for(Integer x:set){
            if(x > 99 && check(x)){
                System.out.println(x);
            }
        }

    }
}
