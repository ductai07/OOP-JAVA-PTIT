package J06001;

public class SanPham {
    private String maloai, tenSP;
    private long dongialoai1, dongialoai2;

    public SanPham(String maloai, String tenSP, long dongialoai1, long dongialoai2) {
        this.maloai = maloai;
        this.tenSP = tenSP;
        this.dongialoai1 = dongialoai1;
        this.dongialoai2 = dongialoai2;
    }

    public String getMaloai() {
        return maloai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDongialoai1() {
        return dongialoai1;
    }

    public long getDongialoai2() {
        return dongialoai2;
    }
}