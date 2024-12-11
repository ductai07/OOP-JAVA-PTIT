package BAITHUCHANH2.THUC_TAP_CO_SO;

public class Detai {
    private String ma, tenGiangvien, tenDetai;
    private static int idCount = 1;

    public Detai(String tenGiangvien, String tenDetai) {
        this.ma = String.format("DT%03d", idCount++);
        this.tenGiangvien = tenGiangvien;
        this.tenDetai = tenDetai;
    }

    public String getMa() {
        return ma;
    }

    public String getTenGiangvien() {
        return tenGiangvien;
    }

    public String getTenDetai() {
        return tenDetai;
    }
}