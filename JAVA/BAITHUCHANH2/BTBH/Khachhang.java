package BAITHUCHANH2.BTBH;

public class Khachhang {
    private String ma;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private static int cnt = 1;

    public Khachhang(String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ma = String.format("KH%03d", cnt++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }
}