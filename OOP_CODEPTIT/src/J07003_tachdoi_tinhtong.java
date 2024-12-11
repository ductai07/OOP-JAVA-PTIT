import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J07003_tachdoi_tinhtong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        String s=sc.nextLine();
        while(s.length()>1){
            int mid=s.length()/2;
            String first_str= s.substring(0,mid);
            String sec_str=s.substring(mid);
            BigInteger fi=new BigInteger(first_str);
            BigInteger se = new BigInteger(sec_str);
            BigInteger sum=fi.add(se);
            System.out.println(sum);
            s=sum.toString();
        }
    }
}
