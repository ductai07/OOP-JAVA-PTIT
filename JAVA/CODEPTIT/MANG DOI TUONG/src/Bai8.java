import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int N = sc.nextInt();  
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            sortByFrequency(A);  
        }
    }

    private static void sortByFrequency(int[] A) {
    Map<Integer, Integer> freqMap = new LinkedHashMap<>();
    for (int num : A) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    List<Integer> list = new ArrayList<>(freqMap.keySet());

    Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = freqMap.get(a);
                int freqB = freqMap.get(b);
                if (freqA != freqB) {
                     
                    return Integer.compare(freqB, freqA);
                } else {
                     
                    return 0;
                }
            }
        });

    for (int num : list) {
        for (int i = 0; i < freqMap.get(num); i++) {
            System.out.print(num + " ");
        }
    }
    System.out.println();
    }
}