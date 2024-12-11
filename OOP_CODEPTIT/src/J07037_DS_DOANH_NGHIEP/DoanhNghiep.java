package J07037_DS_DOANH_NGHIEP;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDN,tenDN;
    private int sl;

    public DoanhNghiep(String maDN, String tenDN, int sl) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.sl = sl;
    }
    public String getMa(){
        return maDN;
    }
    @Override
    public int compareTo(DoanhNghiep o){
        return this.maDN.compareTo(o.getMa());
    }
    @Override
    public String toString(){
        return maDN+" "+tenDN+" "+sl;
    }

}
