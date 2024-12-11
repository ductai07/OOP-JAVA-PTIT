package BAI_THUC_HANH3.D;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int giaBan;
    private int thoiHanBH;

    public SanPham(String maSP, String tenSP, int giaBan, int thoiHanBH) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBH = thoiHanBH;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThoiHanBH() {
        return thoiHanBH;
    }
}