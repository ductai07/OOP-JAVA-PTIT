/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05036_TINH_GIA_ban;

/**
 *
 * @author ASUS
 */
public class MatHang implements Comparable<MatHang>{
    private String maHang,tenHang,donviTinh;
    private int donGiaNhap,soLuong,phiVanchuyen,thanhTien,giaban;
    private static int cnt = 0;
    public MatHang(String tenHang, String donviTinh, int donGiaNhap, int soLuong) {
        cnt++;
        this.maHang = String.format("MH%02d", cnt);
        this.tenHang = tenHang;
        this.donviTinh = donviTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
        tinhtoan();
    }
    private void tinhtoan(){
        phiVanchuyen = (int) Math.round((donGiaNhap*soLuong)*0.05);
        thanhTien = (int) Math.round(donGiaNhap*soLuong + phiVanchuyen);
        giaban = (int) Math.round(( ((thanhTien + 0.02*thanhTien)/soLuong)+99)/100)*100;
        
    }

    public int getGiaban() {
        return giaban;
    }
    @Override
    public int compareTo(MatHang o){
         
        return Integer.compare(o.getGiaban(),giaban);
    }
    
    @Override
    public String toString(){
         
        return maHang+" "+ tenHang+" "+donviTinh+" "+ phiVanchuyen+" "+thanhTien+" "+giaban;
    }
    
    
    
}
