package J04003_PHANSO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PHANSO a=new PHANSO(sc.nextLong(),sc.nextLong());
        long gcd=a.gcd(a.getTu(), a.getMau());
        System.out.println((long)(a.getTu()/gcd)+"/"+(long)(a.getMau()/gcd));
    }
}
