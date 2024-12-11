package J04007_KHAI_BAO_LOP_NV;

public class Nhanvien {
    private String name,sex,bir,addr,maThue,contract;
    public Nhanvien(String name,String sex,String bir,String addr,String maThue,String contract ){
        this.name=name;
        this.sex=sex;
        this.addr=addr;
        this.bir=bir;
        this.maThue=maThue;
        this.contract=contract;
    }
    public String toString(){
        return "00001 "+ name+" "+sex+" "+bir+" "+addr+" "+maThue+" "+contract;
    }
}
