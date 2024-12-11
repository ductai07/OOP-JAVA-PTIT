import java.util.*;

public class J08015_Cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            Map<Long, Long> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                mp.put(x, mp.getOrDefault(x, 0L) + 1);
            }
            long cnt = 0;
            for (long x : mp.keySet()) {
                if (x * 2 == k) { 
                    cnt += mp.get(x) * (mp.get(x) - 1); // Đếm số cặp (x, x)
                } else if (mp.get(k-x)!=null) { 
                    cnt += mp.get(x) * mp.getOrDefault(k - x, 0L);  
                }
            }
            System.out.println(cnt/2);
        }
    }
}
