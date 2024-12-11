import java.util.*;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(countValidPairs(A));
    }

    private static long countValidPairs(int[] A) {
        Stack<Integer> stack = new Stack<>();
        long count = 0;
        for(int i = 0; i < A.length; i++) {
            int current = A[i];
            int sameCount = 1;
            while(!stack.isEmpty() && stack.peek() <= current) {
                if(stack.peek() == current) {
                    sameCount++;
                }
                stack.pop();
                count++;
            }
            if(!stack.isEmpty()) {
                count++;
            }
            for(int j = 0; j < sameCount; j++) {
                stack.push(current);
            }
        }
        return count;
    }
}