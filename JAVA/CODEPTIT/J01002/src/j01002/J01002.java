package j01002;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class J01002 {
    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            if(check(n)==true){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
