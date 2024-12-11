import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        String s = sc.nextLine();
        int cntX = 0, cntT = 0, cntD = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'X') cntX++;
            else if (ch == 'T') cntT++;
            else cntD++;
        }
        int T = 0, D = 0, TX = 0;
        for (int i = 0; i < cntX; i++) {
            if (s.charAt(i) == 'T') T++;
            else if (s.charAt(i) == 'D') D++;
        }
        for (int i = cntX; i < cntX + cntT; i++) {
            if (s.charAt(i) == 'X') TX++;
            else if (s.charAt(i) == 'D') D++;
        }

        
        System.out.println(T + TX - Math.min(T, TX)  + D);
    }
}