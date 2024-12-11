/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21C05;

/**
 *
 * @author ASUS
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Phim implements Comparable<Phim>{
    private String maphim, tenphim,theloai ;
    private int sotap ;
    private LocalDate ngaychieu;
    private static int cnt = 0;
    public Phim( String theloai,String ngaychieu, String tenphim, int sotap) {
        cnt++;
        this.maphim = String.format("P%03d",cnt);
        this.theloai = theloai;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        this.ngaychieu = LocalDate.parse(ngaychieu, format);
        this.tenphim = tenphim;
        this.sotap = sotap;
    }
    @Override
    public int compareTo(Phim o){
        if(this.ngaychieu != o.ngaychieu){
            return this.ngaychieu.compareTo(o.ngaychieu);
        }
        else if(this.tenphim != o.tenphim){
            return this.tenphim.compareTo(o.tenphim);
        }
        else return o.sotap - this.sotap;
    }
    @Override
    public String toString(){
        return maphim+" "+theloai+" "+ngaychieu+" "+tenphim+" "+sotap;
    }
    
    
}
