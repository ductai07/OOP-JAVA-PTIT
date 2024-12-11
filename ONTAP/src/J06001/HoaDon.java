package J06001;

public class HoaDon {
    private SanPham sp;
    private String mahoadon;
    private long giamgia, tongtien;

    public HoaDon(String mahoadon, SanPham sp, long giamgia, long tongtien) {
        this.mahoadon = mahoadon;
        this.sp = sp;
        this.giamgia = giamgia;
        this.tongtien = tongtien;
    }

    @Override
    public String toString(){
        return mahoadon + " " + sp.getTenSP() + " " + giamgia + " " + tongtien;
    }
}