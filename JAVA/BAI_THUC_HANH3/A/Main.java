package BAI_THUC_HANH3.A;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine() ;
            String lop = sc.nextLine() ;
            String email = sc.nextLine() ;
            String soDT = sc.nextLine() ;
            ds.add(new SinhVien(maSV, hoTen, lop, email, soDT));
        }
    
        Collections.sort(ds);
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}