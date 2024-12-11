/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21D01;

/**
 *
 * @author ASUS
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV,hoTen,lop,email,sdt; 

    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+ sdt;
    }
    @Override
    public int compareTo(SinhVien o){
        return this.maSV.compareTo(o.maSV);
    }
    @Override 
    public String toString(){
        return sdt;
    }
    
}
