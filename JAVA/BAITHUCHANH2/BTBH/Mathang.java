package BAITHUCHANH2.BTBH;

public class Mathang {
    private String ma;
    private String ten;
    private String donvitinh;
    private int giamua;
    private int giaban;
    private static int idCounter = 1;

    public Mathang(String ten, String donvitinh, int giamua, int giaban) {
        this.ma = String.format("MH%03d", idCounter++);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
}