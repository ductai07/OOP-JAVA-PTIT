package J07048_DS_SAN_PHAM;

public class SanPham implements Comparable<SanPham>{
    private String maSP,tenSP;
    private int giaBan,baoHanh;

    public SanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMaSP() {
        return maSP;
    }
    @Override
    public int compareTo(SanPham o) {
        // So sánh giá bán trước
        int giaBanComparison = Integer.compare(this.giaBan, o.getGiaBan());
        if (giaBanComparison == 0) {
            // Nếu giá bán bằng nhau, so sánh mã sản phẩm
            return this.maSP.compareTo(o.getMaSP());
        }
        else if(giaBanComparison>0){
            return giaBanComparison;
        }
        return -1;
    }
    @Override
    public String toString(){
        return maSP+" "+tenSP+" "+giaBan+" "+baoHanh;
    }

}
