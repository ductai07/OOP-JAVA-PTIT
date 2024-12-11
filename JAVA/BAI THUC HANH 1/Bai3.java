import java.util.Scanner;
public class Bai3 {
    public static long prime(long n){
        long max_=0;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                max_=Math.max(max_, i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        max_=Math.max(max_, n);
        return max_;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(prime(n));
        }
        
    }
}
