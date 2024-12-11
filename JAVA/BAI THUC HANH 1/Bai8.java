/*
 Cho dãy số A[] gồm có N phần tử. Nhiệm vụ của bạn là hãy sắp xếp dãy số này theo tần suất xuất hiện của chúng. Số nào có số lần xuất hiện lớn hơn in ra trước. Nếu có 2 số có số lần xuất hiện bằng nhau, số nào xuất hiện trong dãy A[] trước sẽ được in ra trước.

Chú ý: Nên cố gắng sử dụng các lớp phù hợp trong Java. 

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 10).

Mỗi test gồm số nguyên N (1≤ N ≤ 100 000), số lượng phần tử trong dãy số ban đầu.

Dòng tiếp theo gồm N số nguyên A[i] (-10^9 ≤ A[i] ≤ 10^9).

Output: 

Với mỗi test, in ra trên một dòng là dãy số thu được sau khi thực hiện sắp xếp.

 

Ví dụ:

Input:

Output

2

8

2 5 2 8 5 6 8 8

10

2 5 2 6 -1 9999999 5 8 8 8

 

8 8 8 2 2 5 5 6

8 8 8 2 2 5 5 6 -1 9999999


 */
import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> mp = new HashMap<>();
            
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(!mp.containsKey(x)){
                    a.add(x);
                    mp.put(x,1);
                }
                else mp.put(x,mp.get(x)+1);
            }
            
            Collections.sort(a,new Comparator<Integer>() {
                @Override
                public int compare(Integer a1,Integer a2){
                    return mp.get(a2)-mp.get(a1);
                }
            });
            
            for (int num : a) {
                for(int j=0;j<mp.get(num);j++){
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }
      
    }
}