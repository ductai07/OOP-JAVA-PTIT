package J04005_KHAI_BAO_LOP_THISINH;

public class Thisinh {
    private String hoTen,ngaySinh;
    private double diem1,diem2,diem3;
    public Thisinh(String hoTen,String ngaySinh,double diem1,double diem2,double diem3){
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }
    public String getTen(){
        return hoTen;
    }
    public String getns(){
        return ngaySinh;
    }
    public double getdiem1(){
        return diem1;
    }
    public double getdiem2(){
        return diem2;
    }
    public double getdiem3(){
        return diem3;
    }
    public double add(){
        return diem1+diem2+diem3;
    }
}
