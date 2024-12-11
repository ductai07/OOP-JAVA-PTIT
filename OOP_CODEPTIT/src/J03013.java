import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int len=Math.max(a.toString().length(), b.toString().length());
            BigInteger c = a.subtract(b).abs();
            int len_tmp=c.toString().length();
            String res="";
            for(int i=0;i<len-len_tmp;i++){
                res+="0";
            }
            res+=c.toString();
            System.out.println(res);
            
        }
    }
}
