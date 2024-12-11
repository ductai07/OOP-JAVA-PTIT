package COLLECTIONS.src.COLLECTIONS.src;

import java.util.*;

public class Bai4 {
    private static boolean check(String number) {
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) < number.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<>();
        
        while (sc.hasNext()) {
            String number = sc.next();
            if (check(number)) {
                mp.put(number, mp.getOrDefault(number, 0) + 1);
            }
        }
        sc.close();
        ArrayList<Map.Entry<String, Integer>> sot = new ArrayList<>(mp.entrySet());
        Collections.sort(sot, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int cmp = Integer.compare(e2.getValue(), e1.getValue());
                if (cmp == 0) {
                    return 0; 
                }
                return cmp;
            }
        });
        
        for (Map.Entry<String, Integer> entry : sot) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    
}