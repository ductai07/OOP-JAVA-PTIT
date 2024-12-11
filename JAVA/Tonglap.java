import java.util.Scanner;
import java.math.BigInteger;

public class Tonglap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        
        while (num.length() > 1) {
            int n = num.length();
            int mid = n / 2;
            String firstHalf = num.substring(0, mid);
            String secondHalf = num.substring(mid);
            
            BigInteger firstHalfNum = new BigInteger(firstHalf);
            BigInteger secondHalfNum = new BigInteger(secondHalf);
            BigInteger sum = firstHalfNum.add(secondHalfNum);
            System.out.println(sum);
            num = sum.toString();
        }
        
        sc.close();
    }
}