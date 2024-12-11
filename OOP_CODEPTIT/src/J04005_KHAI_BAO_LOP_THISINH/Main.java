package J04005_KHAI_BAO_LOP_THISINH;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Thisinh a= new Thisinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.print(a.getTen()+" "+a.getns()+" ");
        System.out.printf("%.1f",a.add());
    }

}
