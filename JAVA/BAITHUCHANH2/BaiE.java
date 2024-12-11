package BAITHUCHANH2;

import java.util.*;

public class BaiE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            while (!st.isEmpty() && t > st.peek()) {
                int top = st.pop();
                mp.put(top, mp.get(top) - 1);
                cnt++;
            }
            if (!st.isEmpty()) {
                if (t == st.peek()) {
                    cnt += mp.get(t) +(st.size()>mp.get(t) ? 1 :0 );
                } else {
                    cnt++;
                }
            }
            st.push(t);
            mp.put(t, mp.getOrDefault(t, 0) + 1);
        }
        
        System.out.println(cnt);
    }
}