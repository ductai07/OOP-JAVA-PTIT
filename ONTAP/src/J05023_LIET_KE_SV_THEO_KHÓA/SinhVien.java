/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023_LIET_KE_SV_THEO_KHÓA;

public class SinhVien {
    private String maSV,hoTen,lop,email ;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }
    

    @Override
    public String toString() {
        return  maSV + " " + hoTen + " " + lop + " " + email ;
    }
    
}
