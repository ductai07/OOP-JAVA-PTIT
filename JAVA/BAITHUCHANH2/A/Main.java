package BAITHUCHANH2.A;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double score = sc.nextDouble();
            a.add(score);
        }

        double maxScore = Collections.max(a);
        double minScore = Collections.min(a);
        Iterator<Double> iterator = a.iterator();
        while (iterator.hasNext()) {
            double value = iterator.next();
            if (value == maxScore || value == minScore) {
                iterator.remove();
            }
        }

        if (a.isEmpty()) {
            throw new Exception();
        }

        double sum = 0;
        for (double value : a) {
            sum += value;
        }

        double average = sum / a.size();
        System.out.printf("%.2f", average);
    }
}