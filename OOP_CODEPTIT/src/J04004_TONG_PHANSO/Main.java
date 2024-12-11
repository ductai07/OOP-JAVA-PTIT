package J04004_TONG_PHANSO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
        Phanso ps1=new Phanso(a,b);
        Phanso ps2=new Phanso(c,d);
        ps1.add(ps2);
        long gcdd=ps1.gcd(ps1.getTu(),ps1.getMau());
        System.out.print(ps1.getTu()/gcdd+"/"+ps1.getMau()/gcdd);
    }
    

}
