package BAITHUCHANH2.BTBH;

public class Hoadon {
    private String ma;
    private Khachhang khachhang;
    private Mathang mathang;
    private int soluong;
    private static int idCount = 1;

    public Hoadon(Khachhang khachhang, Mathang mathang, int soluong) {
        this.ma = String.format("HD%03d", idCount++);
        this.khachhang = khachhang;
        this.mathang = mathang;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public Mathang getMathang() {
        return mathang;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getThanhtien() {
        return soluong * mathang.getGiaban();
    }

    @Override
    public String toString() {
        return ma + " " + khachhang.getTen() + " " + khachhang.getDiachi() + " " + mathang.getTen() + " " + mathang.getDonvitinh() + " " + mathang.getGiamua() + " " + mathang.getGiaban() + " " + soluong + " " + getThanhtien();
    }
}