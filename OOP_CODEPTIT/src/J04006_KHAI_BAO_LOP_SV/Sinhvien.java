package J04006_KHAI_BAO_LOP_SV;

public class Sinhvien {
    private String hoTen,lop,ns;
    private double gpa;
    public Sinhvien(String hoTen,String lop,String ns,double gpa){
        this.hoTen=hoTen;
        this.lop=lop;
        this.ns=ns;
        this.gpa=gpa;

    }
    public void chuanhoa(){
        StringBuilder res = new StringBuilder(ns);
        if (res.charAt(1) == '/') {
            res.insert(0, "0");
        }
        if (res.charAt(4) == '/') {
            res.insert(3, "0");
        }
        ns=res.toString();
    }
    public String toString(){
        chuanhoa();
        return "B20DCCN001"+" "+hoTen+" "+lop+" "+ns+" "+String.format("%.2f", gpa); 
    }

}
