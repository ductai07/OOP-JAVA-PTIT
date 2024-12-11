package VAO_RA_FILE_NP.BAI1;

import java.io.*;
import java.util.*;

public class BAI1 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
         ArrayList<Integer> data1;
         ArrayList<Integer> data2;

        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        data1 = (ArrayList<Integer>) in1.readObject();
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        data2 = (ArrayList<Integer>) in2.readObject();
        in2.close();

         Set<Integer> data2Set = new HashSet<>(data2);

         List<Integer> primes = new ArrayList<>();
        for (int num : data1) {
            if (isPrime(num) && !data2Set.contains(num)) {
                primes.add(num);
            }
        }

         Collections.sort(primes);

         Set<String> pairs = new LinkedHashSet<>();
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                int n = primes.get(i);
                int m = primes.get(j);
                if (n + m == 1000000) {
                    pairs.add(n + " " + m);
                }
            }
        }       
         for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}