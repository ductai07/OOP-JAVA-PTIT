/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05043_TINH_THU_NHAP_NV;


public class NhanVien {
    private String maNV,hoTen,chucVu;
    private int luongCB,ngayCong;
    private double tamUng;
    private static int cnt =0;
    public NhanVien(String hoTen, String chucVu, int luongCB, int ngayCong) {
        cnt++;
        this.maNV = String.format("NV%02d", cnt);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.tamUng=0;
    }
    private int phuCapchucvu(){
        int pccv=0;
        if(chucVu.equals("GD")){
            pccv=500;
        }
        else if(chucVu.equals("PGD")){
            pccv=400;
        }
        else if(chucVu.equals("TP")){
            pccv=300;
        }
        else if(chucVu.equals("KT")){
            pccv=250;
        }
        else pccv=100;
        return pccv;
    }
    private void xuli() {
    int pccv = phuCapchucvu();
    double tong = pccv + (luongCB * ngayCong);
    double tamUngTinhToan = tong * 2 / 3;

    if (tamUngTinhToan < 25000) {
        tamUng = Math.round(tamUngTinhToan / 1000) * 1000; // Làm tròn đến hàng nghìn
    } else {
        tamUng = 25000;
    }
    
}
    @Override
    public String toString(){
        xuli();
        return maNV+" "+hoTen+" "+phuCapchucvu()+" "+(luongCB*ngayCong)+" "+(String.format("%.0f", tamUng))+" "+String.format("%.0f",(luongCB*ngayCong+(phuCapchucvu()))-tamUng);
    }
    
}
