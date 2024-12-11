

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J02034_Bo_sung_day_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        int[] a = new int[n];
        int max_=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            max_=Math.max(max_, a[i]);
            mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
        }
        int ok=0;
        for(int i=1;i<=max_;i++){
            if(!mp.containsKey(i)){
                ok=1;
                System.out.println(i);
            }
        }
        if(ok==0){
            System.out.println("Excellent!");
        }
        
                
    }
}
