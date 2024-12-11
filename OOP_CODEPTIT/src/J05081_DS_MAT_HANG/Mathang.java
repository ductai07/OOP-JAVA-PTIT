package J05081_DS_MAT_HANG;

public class Mathang {
    private String ma,ten,donvi;
    private int giaban,giamua,loinhuan;
    private static int cnt = 1;
    public Mathang(String ten,String donvi,int giamua,int giaban){
        this.ma=String.format("MH%03d", cnt++);
        this.ten=ten;
        this.donvi=donvi;
        this.giaban=giaban;
        this.giamua=giamua;
        this.loinhuan = giaban - giamua;
    }
    public int getBan(){
        return giaban;
    }
    public int getMua(){
        return giamua;
    }
    public int getLoinhuan(){
        return loinhuan;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan;
    }
}
