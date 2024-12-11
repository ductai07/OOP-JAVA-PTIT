package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String maMH,tenMH;
    private int tinchi;

    public MonHoc(String maMH, String tenMH, int tinchi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.tinchi = tinchi;
    }
    public String getTen(){
        return tenMH;
    }
    @Override
    public int compareTo(MonHoc o){
        return this.tenMH.compareTo(o.getTen());
    }
    @Override
    public String toString(){
        return maMH+" "+tenMH+" "+tinchi;
    }
}
