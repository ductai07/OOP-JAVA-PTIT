package J07046_DS_LUU_TRU;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String maKH, hoTen, maPhong, ngayDen, ngayDi;
    private int ngayLuuTru;
    private static int cnt = 0;

    public KhachHang(String hoTen, String maPhong, String ngayDen, String ngayDi) {
        cnt++;
        this.hoTen = hoTen;
        this.maKH = String.format("KH%02d", cnt);
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(ngayDen, formatter);
        LocalDate end = LocalDate.parse(ngayDi, formatter);
        this.ngayLuuTru = (int) ChronoUnit.DAYS.between(start, end);
    }

    public int getNgayLuuTru() {
        return ngayLuuTru;
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.getNgayLuuTru() - this.ngayLuuTru;
    }

    @Override
    public String toString() {
        return maKH + " " + hoTen + " " + maPhong + " " + ngayLuuTru;
    }
}
