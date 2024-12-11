/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang>{
    private String maKH,tenKH,soPhong;
    private long dvPhatSinh,soNgayo,tongTien;
    private LocalDate ngayNhanPhong;
    private LocalDate ngayTraphong;
    private static int cnt = 0;
    public KhachHang(String tenKH ,String soPhong,String ngayNhanPhong,String ngayTraphong ,long dvPhatSinh){
        cnt++;
        this.maKH = String.format("KH%02d",cnt);
        this.tenKH = tenKH ;
        this.soPhong = soPhong;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.ngayNhanPhong = LocalDate.parse (ngayNhanPhong ,format);
        this.ngayTraphong = LocalDate.parse (ngayTraphong ,format);
        this.soNgayo = ChronoUnit.DAYS.between(this.ngayNhanPhong, this.ngayTraphong) +1;
        this.dvPhatSinh = dvPhatSinh;
        chuanhoa();
        tinhtoan();
        
    }
    private void tinhtoan(){
        tongTien = dvPhatSinh;
        Character tmp = soPhong.charAt(0);
        if(tmp == '1') tongTien += (25*soNgayo);
        else if(tmp=='2') tongTien += (34*soNgayo);
        else if(tmp =='3') tongTien += (50*soNgayo);
        else tongTien += (80*soNgayo);
    }
    private void chuanhoa(){
        String[] tokens = tenKH.toLowerCase().trim().split("\\s+");
        String res="";
        for(String ss : tokens){
            res+=Character.toUpperCase(ss.charAt(0))+ss.substring(1)+" ";
        }
        tenKH = res.trim();
    }
    
    public long getTongTien() {
        return tongTien;
    }
    @Override
    public int compareTo(KhachHang o){
        return Long.compare(o.getTongTien(), tongTien);
    }
    @Override
    public String toString(){
        return maKH+" "+tenKH+" "+soPhong+" "+soNgayo+" "+tongTien;
    }
    
    
}
