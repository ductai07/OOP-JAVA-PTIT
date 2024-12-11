package J04015_TINH_THU_NHAP_GV;

public class Giaovien {
    private String ma,ten;
    private long luong;
    public Giaovien(String ma,String ten,long luong){
        this.ma=ma;
        this.ten=ten;
        this.luong=luong;
    }
    public String getMa(){
        return ma;
    }
    public long getLuong(){
        return luong;
    }
    public String getTen(){
        return ten;
    }
}
