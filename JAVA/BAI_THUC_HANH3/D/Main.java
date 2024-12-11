package BAI_THUC_HANH3.D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<SanPham> dsSanPham = new ArrayList<>();
        List<KhachHang> dsKhachHang = new ArrayList<>();
        Map<String, SanPham> mapSanPham = new HashMap<>();
       
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String maSP = sc.nextLine();
            String tenSP = sc.nextLine();
            int giaBan = Integer.parseInt(sc.nextLine());
            int thoiHanBH = Integer.parseInt(sc.nextLine());
            SanPham sanPham = new SanPham(maSP, tenSP, giaBan, thoiHanBH);
            dsSanPham.add(sanPham);
            mapSanPham.put(maSP, sanPham);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String hoTen = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSP = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            String ngayMua = sc.nextLine();
            SanPham sanPham = mapSanPham.get(maSP);
            KhachHang khachHang = new KhachHang(hoTen, diaChi, maSP, soLuong, ngayMua, sanPham);
            dsKhachHang.add(khachHang);
                
        }
          
        Collections.sort(dsKhachHang);
        for (KhachHang kh : dsKhachHang) {
            System.out.println(kh);
        }
    }
}