package J04004_TONG_PHANSO;

public class Phanso {
    private long tu;
    private long mau;
    public Phanso(long tu,long mau){
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
    public void add(Phanso b){
        long lcm= (this.mau*b.mau)/gcd(this.mau,b.mau);
        this.tu*=(lcm/this.mau);
        b.tu*=(lcm/b.mau);
        this.tu=this.tu+b.tu;
        this.mau=lcm;
    }
}
