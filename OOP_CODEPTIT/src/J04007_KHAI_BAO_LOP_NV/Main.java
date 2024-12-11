package J04007_KHAI_BAO_LOP_NV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien a= new Nhanvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
        System.out.println(a);
    }
}
