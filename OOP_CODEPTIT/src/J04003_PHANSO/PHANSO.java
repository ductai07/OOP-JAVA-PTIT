package J04003_PHANSO;

public class PHANSO {
    private long tu;
    private long mau;
    public PHANSO(long tu,long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public void setTu(long tu){
        this.tu=tu;
    }
    public void setMau(long mau){
        this.mau=mau;
    }
    public long gcd(long tu,long mau){
        if(mau==0) return tu;
        return gcd(mau,tu%mau);
    }
}
