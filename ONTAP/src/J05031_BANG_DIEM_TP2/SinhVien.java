/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05031_BANG_DIEM_TP2;

/**
 *
 * @author ASUS
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV,hoTen,lop;

    private double diem1,diem2,diem3;

    public SinhVien(String maSV, String hoTen, String lop, double diem1, double diem2, double diem3) {

        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoTen() {
        return hoTen;
    }
    @Override
    public int compareTo(SinhVien o){
        return this.hoTen.compareTo(o.getHoTen());
    }

    @Override
    public String toString() {
        return  maSV + " " + hoTen + " " + lop + " " + String.format("%.1f",diem1) + " " + String.format("%.1f",diem2) + " " + String.format("%.1f",diem3) ;
    }
    
    
    
}
