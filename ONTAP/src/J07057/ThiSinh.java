/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

/**
 *
 * @author ASUS
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS,hoTen,danToc,khuVuc,trangThai;
    private double diemThi,tongDiem;
    private static int cnt =0;
    public ThiSinh(String hoTen,double diemThi, String danToc, String khuVuc ) {
        cnt++;
        this.maTS = String.format("TS%02d", cnt);
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        this.diemThi = diemThi;
        this.tongDiem=0;
        chuanhoa();
        tinhtoan();
    }
    private void chuanhoa(){
        String[] tokens = hoTen.toLowerCase().trim().split("\\s+");
        String res="";
        for(String s:tokens){
            res+= Character.toUpperCase(s.charAt(0))+s.substring(1)+" ";
        }
        hoTen = res.trim();
            
    }
    private void tinhtoan(){
        tongDiem = diemThi; // Bắt đầu từ điểm thi gốc

        // Cộng điểm khu vực
        if (khuVuc.equals("1")) tongDiem += 1.5;
        else if (khuVuc.equals("2")) tongDiem += 1;

        // Cộng điểm dân tộc
        if (!danToc.equals("Kinh")) tongDiem += 1.5;

        // Xác định trạng thái
        if (tongDiem >= 20.5) trangThai = "Do";
        else trangThai = "Truot";

    }

 
    
    @Override
    public int compareTo(ThiSinh o){
        if(this.tongDiem == o .tongDiem){
            return this.maTS.compareTo(o.maTS );
        }
        else return Double.compare(o.tongDiem , this.tongDiem);
        
    }
    @Override
    public String toString(){
        return maTS+" " +hoTen+" "+String.format("%.01f", tongDiem)+" "+trangThai;
    }
    
    
    
    
    
}
