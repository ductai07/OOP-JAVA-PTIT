package BAITHUCHANH2.THUC_TAP_CO_SO;

public class Sinhvien {
    private String ma, ten, sdt, email;

    public Sinhvien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }
}