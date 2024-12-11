/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21C04;

/**
 *
 * @author ASUS
 */
public class HoaDon implements Comparable<HoaDon> {
    private String maMH,tenMH;
    private long soluong,dongia,chietkhau,tongtien;

    public HoaDon(String maMH, String tenMH, long soluong, long dongia, long chietkhau) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tongtien= tinhTongtien();
    }
    private long tinhTongtien(){
        tongtien = soluong*dongia-chietkhau;
        return tongtien;
    }
    @Override
    public int compareTo(HoaDon o){
        return Long.compare(o.tongtien, this.tongtien);
    }
    @Override
    public String toString(){
        return maMH+" "+tenMH+" "+soluong+" "+dongia+" "+chietkhau+" "+tongtien;
    }
    
    
    
}
