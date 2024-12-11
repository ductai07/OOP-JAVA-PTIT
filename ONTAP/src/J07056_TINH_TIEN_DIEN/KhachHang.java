/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07056_TINH_TIEN_DIEN;

/**
 *
 * @author ASUS
 */
public class KhachHang implements  Comparable<KhachHang>{
    private String maKH,hoTen,loaiHo;
    private int dau,cuoi,tientrongDM,tienvuotDM,tienPhat;
    private static int cnt =0;
    public KhachHang( String hoTen, String loaiHo, int dau, int cuoi) {
        cnt++;
        this.maKH = String.format("KH%02d",cnt);
        this.hoTen = hoTen;
        this.loaiHo = loaiHo;
        this.dau = dau;
        this.cuoi = cuoi;
    }
    
    private void tinhDM(){
        int tmpDM=0;
        if(loaiHo.equals("A")){
             tmpDM = 100 ;
            
        }
        else if(loaiHo.equals("B")){
            tmpDM=500;
        }
        else tmpDM=200;
        int soDien = cuoi - dau;
        
        if(soDien < tmpDM) tientrongDM = (soDien)*450;
        else  tientrongDM = tmpDM*450;
        
        if(soDien > tmpDM ) tienvuotDM = (soDien - tmpDM) *1000;
        else tienvuotDM=0;
        tienPhat = tientrongDM + tienvuotDM + (int)(tienvuotDM*0.05) ;
        
    }
    private String chuanhoaHoTen(){
        String res = "";
        String[] tokens = hoTen.trim().toLowerCase().split("\\s+");
        for(String tok : tokens){
            res+= Character.toUpperCase(tok.charAt(0)) + tok.substring(1)+" ";
        }
        return res.trim();
        
    }

    public int getTienPhat() {
        return tienPhat;
    }
    
    @Override
    public int compareTo(KhachHang o){
        return o.getTienPhat()-tienPhat;
    }
    @Override
    public String toString(){
        tinhDM();
        hoTen = chuanhoaHoTen();
        return maKH+" "+hoTen+" "+tientrongDM +" " +tienvuotDM+" "+  (int) (tienvuotDM*0.05) +" "+tienPhat;
    }
    
   
    
}
