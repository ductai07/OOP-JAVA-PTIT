package BAI_THUC_HANH3.B;

import java.text.*;
import java.util.*;

public class CongNhan implements Comparable<CongNhan> {
    private String maCN, tenCN, gioVao, gioRa;
    private long thoiGianLamViec;  

    public CongNhan(String maCN, String tenCN, String gioVao, String gioRa) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.thoiGianLamViec = tinhThoiGianLamViec();
    }

    private long tinhThoiGianLamViec() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date vao = sdf.parse(gioVao);
            Date ra = sdf.parse(gioRa);
            long diff = ra.getTime() - vao.getTime();
            long oke = diff / (60 * 1000) - 60;  
            return oke;
         } 
         catch (ParseException e) {
             return 0;
        }
    }

    @Override
    public int compareTo(CongNhan other) {
        if (this.thoiGianLamViec != other.thoiGianLamViec) {
            return Long.compare(other.thoiGianLamViec, this.thoiGianLamViec);
        }
        return this.maCN.compareTo(other.maCN);
    }

    @Override
    public String toString() {
        long gio = thoiGianLamViec / 60;
        long phut = thoiGianLamViec % 60;
        String trangThai = thoiGianLamViec >= 480 ? "DU" : "THIEU";
        return String.format("%s %s %d gio %d phut %s", maCN, tenCN, gio, phut, trangThai);
    }


}