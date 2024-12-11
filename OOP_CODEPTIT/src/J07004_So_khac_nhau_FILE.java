import java.io.*;
import java.util.*;

public class J07004_So_khac_nhau_FILE {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.IN"))) {
            ArrayList<Integer> list = (ArrayList<Integer>) obj.readObject();
            Map<Integer, Integer> mp = new TreeMap<>();
            for (int num : list) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
            for (Integer key : mp.keySet()) {
                System.out.println(key + " " + mp.get(key));
            }
        }
    }
}