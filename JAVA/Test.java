import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        in.close();
         Map<Integer, Integer> primeCount = new HashMap<>();
        for (Integer x : ds) {
            if (prime(x)) {
                primeCount.put(x, primeCount.getOrDefault(x, 0) + 1);
            }
        }
         ArrayList<Integer> primes = new ArrayList<>(primeCount.keySet());
        Collections.sort(primes);
         for (Integer prime : primes) {
            System.out.println(prime + " " + primeCount.get(prime));
        }
    }
}