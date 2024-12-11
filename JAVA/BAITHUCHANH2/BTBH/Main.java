package BAITHUCHANH2.BTBH;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Khachhang> khachhangList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            khachhangList.add(new Khachhang(ten, gioitinh, ngaysinh, diachi));
        }
        sc = new Scanner(new File("MH.in"));
        int m = sc.nextInt();
        sc.nextLine();
        List<Mathang> mathangList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ten = sc.nextLine();
            String donvitinh = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            mathangList.add(new Mathang(ten, donvitinh, giamua, giaban));
        }
        sc = new Scanner(new File("HD.in"));
        int k = sc.nextInt();
        sc.nextLine();
        List<Hoadon> hoadonList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String[] parts = sc.nextLine().split("\\s+");
            String maKH = parts[0];
            String maMH = parts[1];
            int soluong = Integer.parseInt(parts[2]);

            Khachhang kh=null;
            for (Khachhang kh1 : khachhangList) {
                if (kh1.getMa().equals(maKH)) {
                    kh = kh1;
                    break;
                }
            }
            
            Mathang mh = null;
            for (Mathang mh1 : mathangList) {
                if (mh1.getMa().equals(maMH)) {
                    mh = mh1;
                    break;
                }
            }

            if (kh != null && mh != null) {
                hoadonList.add(new Hoadon(kh, mh, soluong));
            }
        }
        for (Hoadon hd : hoadonList) {
            System.out.println(hd);
        }
    }
}