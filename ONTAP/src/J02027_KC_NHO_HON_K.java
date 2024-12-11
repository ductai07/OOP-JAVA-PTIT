import java.util.*;

public class J02027_KC_NHO_HON_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt();  
            List<Integer> a = new ArrayList<>();
            Map<Integer,Integer > mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                mp.put(x,mp.getOrDefault(x, 0)+1);
                a.add(x);
            }
            
            Collections.sort(a); 
            
            int cnt = 0;
            for(int key:mp.keySet()){
                
            }
            System.out.println(cnt);
        }
    }
}
