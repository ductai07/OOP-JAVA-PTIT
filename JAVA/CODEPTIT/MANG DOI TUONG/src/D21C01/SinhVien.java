/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21C01;

/**
 *
 * @author ASUS
 */
public class SinhVien implements Comparable<SinhVien>{
    private String hoTen ; 
    private int soBai,luotSubmit;

    public SinhVien(String hoTen, int soBai, int luotSubmit) {
        this.hoTen = hoTen;
        this.soBai = soBai;
        this.luotSubmit = luotSubmit;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoBai() {
        return soBai;
    }

    public int getLuotSubmit() {
        return luotSubmit;
    }
    @Override
    public int compareTo(SinhVien o){
        if(this.soBai != o.getSoBai()){
            return Integer.compare(o.getSoBai(), this.soBai);
        }
        else if (this.soBai == o.getSoBai()){
            return Integer.compare(this.luotSubmit, o.getLuotSubmit());
        }
        else return this.hoTen.compareTo(o.getHoTen());
    }
    @Override
    public String toString(){
        return hoTen+" "+soBai+" "+luotSubmit;
    }
    
}
