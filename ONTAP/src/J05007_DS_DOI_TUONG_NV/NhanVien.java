package J05007_DS_DOI_TUONG_NV;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NhanVien implements Comparable<NhanVien> {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngaykiHopdong;
    private static int cnt = 0;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngaykiHopdong) {
        cnt++;
        this.maNV = String.format("%05d", cnt);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngaykiHopdong = ngaykiHopdong;
    }

    public LocalDate getNgaySinhAsDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(ngaySinh, formatter);
    }

    @Override
    public int compareTo(NhanVien o) {
        // So sánh ngày sinh dưới dạng LocalDate
        return this.getNgaySinhAsDate().compareTo(o.getNgaySinhAsDate());
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maThue + " " + ngaykiHopdong;
    }
}
