/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

/**
 *
 * @author ASUS
 */
public class TinhGio {
    private MonHoc mh;
    private GiangVien gv;
    private double tongio;

    public TinhGio(MonHoc mh, GiangVien gv, double tongio) {
        this.mh = mh;
        this.gv = gv;
        this.tongio = tongio;
    }

    public GiangVien getGv() {
        return gv;
    }

    public double getTongio() {
        return tongio;
    }
    
    @Override
    public String toString(){
        return "Giang vien: "+gv.getTenGV()+"\n"+ mh.getTenMon() +" "+tongio;
    }
}
