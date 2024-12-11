package J07033DsSinhVienTrongFile;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> svList = new ArrayList<>();

        for (int i = 1; i <= t; i++) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(maSV, hoTen, lop, email);
            svList.add(a);
        }
        Collections.sort(svList);
        for (SinhVien sv : svList) {
            System.out.println(sv);
        }
    }
}
