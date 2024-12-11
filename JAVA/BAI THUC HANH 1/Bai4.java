import java.util.Scanner;
import java.math.BigInteger;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.nextLine();
            BigInteger tich = BigInteger.ONE;
            int sum=0;
            for(int i=0;i<n.length();i++){
                int d = n.charAt(i)-'0';
                if(i%2==0){
                    if(d!=0){
                        tich=tich.multiply(BigInteger.valueOf(d));
                    }
                }
                else sum+=d;
            }
            System.out.println(tich+" "+sum);

        }
    }
    
}
