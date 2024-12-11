package BAITHUCHANH2.DO_AN_TN;

public class Sinhvien {
    private String ma, ten, lop, email, sdt;

    public Sinhvien(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return "0" + sdt;  
    }
}