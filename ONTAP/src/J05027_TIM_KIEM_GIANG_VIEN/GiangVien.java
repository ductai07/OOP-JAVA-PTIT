
package J05027_TIM_KIEM_GIANG_VIEN;

/**
 *
 * @author ASUS
 */
public class GiangVien {
    private String maGV,hoTen,boMon;
    private static int cnt =0;
    public GiangVien(String hoTen,String boMon){
        cnt++;
        this.maGV = String.format("GV%02d", cnt);
        this.hoTen=hoTen;
        this.boMon=boMon;
    }
    private String mon(){
        String[] tokens=boMon.split("\\s+");
        String res="";
        for (String s:tokens){
            res+=Character.toUpperCase( s.charAt(0));
        }
        return res;
    }

    public String getHoTen() {
        return hoTen;
    }
    @Override
    public String toString(){
        return maGV+" "+hoTen+" "+mon();
    }
    
}
