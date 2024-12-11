package J04006_KHAI_BAO_LOP_SV;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sinhvien a= new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
        System.out.println(a);
    }

}
