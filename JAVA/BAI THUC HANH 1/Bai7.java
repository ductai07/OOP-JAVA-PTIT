/*Cho N xâu S[1], S[2], …, S[N] có độ dài bằng nhau. Mỗi bước, với xâu T, 
bạn được phép xoay vòng 1 kí tự, tức lấy kí tự đầu tiên của T rồi chuyển xuống cuối. 
Ví dụ xâu “cool” sẽ chuyển thành “oolc”.

Bạn cần phải xoay N xâu sao cho tất cả chúng đều giống nhau.
 Hãy xác định số bước ít nhất để hoàn thành được công việc này?

Input:
Mỗi test bắt đầu bởi số nguyên N (1 <= N <= 50).
N dòng tiếp theo, mỗi dòng gồm xâu S[i] có độ dài không quá 50.

Output: 
Với mỗi test, in ra số bước ít nhất tìm được, nếu không thể biến đổi, hãy in ra “NO”.

Ví dụ:

Test 1

Test 2


Input:

4

xzzwo

zwoxz

zzwox

xzzwo

 

Output:

5

 

Input:

2

molzv

lzvmo

 

3

-1 */
import java.util.Scanner;

public class Bai7 {
    public static String Xoayy(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }
    public static int solve(String s, String target) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (Xoayy(s, i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        int min_ = Integer.MAX_VALUE;
        int len = strings[0].length();
        for (int i = 0; i < len; i++) {
            String target = Xoayy(strings[0], i);
            int idx  = i;
            boolean ok = true;
            
            for (int j = 1; j < n; j++) {
                int tmp = solve(strings[j], target);
                if (tmp == -1) {
                    ok = false;
                    break;
                }
                idx += tmp;
            }
            
            if (ok) {
                min_ = Math.min(min_, idx );
            }
        }
        
        if (min_ == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min_);
        }
        
        sc.close();
    }
    
    
    
    
}