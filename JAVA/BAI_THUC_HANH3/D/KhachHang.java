package BAI_THUC_HANH3.D;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang> {
    private static int cnt=0;

    private String maKH,hoTen,diaChi,maSP;
    private int soLuong,tongTien;
    private LocalDate ngayMua,ngayHetHan;
 
    public KhachHang(String hoTen, String diaChi, String maSP, int soLuong, String ngayMuaStr, SanPham sanPham) {
        cnt++;
        this.maKH = String.format("KH%02d", cnt);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngayMua = LocalDate.parse(ngayMuaStr, fm);
        this.tongTien = sanPham.getGiaBan() * soLuong;
        this.ngayHetHan = this.ngayMua.plusMonths(sanPham.getThoiHanBH());
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public String getMaKH() {
        return maKH;
    }

    @Override
    public int compareTo(KhachHang o) {
        if (!this.ngayHetHan.equals(o.ngayHetHan)) {
            return this.ngayHetHan.compareTo(o.ngayHetHan);
        }
        return this.maKH.compareTo(o.maKH);
    }

    @Override
    public String toString() {
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return maKH+" "+hoTen+" "+diaChi+" "+maSP+" "+tongTien+" "+ngayHetHan.format(fm);        
    }
}