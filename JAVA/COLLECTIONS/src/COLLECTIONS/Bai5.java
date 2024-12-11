package COLLECTIONS.src.COLLECTIONS;

import java.util.*;
import java.io.*;

public class Bai5 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<String> lít_chưa_sọt = (ArrayList<String>) new ObjectInputStream(new FileInputStream("NHIPHAN.in")).readObject();
        Set<String> bainari = new HashSet<>();
        for (String line : lít_chưa_sọt) {
            String[] words = line.toLowerCase().split("\\s+");
            bainari.addAll(Arrays.asList(words));
        }
        

        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> result = new LinkedHashSet<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (bainari.contains(word)) {
                    result.add(word);
                }
            }
        }
        sc.close();

         for (String word : result) {
            System.out.println(word);
        }
    }
}