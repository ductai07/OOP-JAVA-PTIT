package J03009;

import java.util.Scanner;
import java.util.TreeMap;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] ts1 = s1.split("\\s+");
            String[] ts2 = s2.split("\\s+");

            TreeMap<String, Integer> mp = new TreeMap<>();
            for (String word : ts1) {
                mp.put(word, mp.getOrDefault(word, 0) + 1);
            }

            for (String word : ts2) {
                if (mp.containsKey(word)) {
                    mp.remove(word);
                }
            }

            for (String word : mp.keySet()) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
