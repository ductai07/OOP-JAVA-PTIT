package J05028_DANH_SACH_DOANH_NGHIEP;

/**
 *
 * @author ASUS
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String vietTat,tenDN;
    private int soLuong;

    public DoanhNghiep(String vietTat, String tenDN, int soLuong) {
        this.vietTat = vietTat;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getVietTat() {
        return vietTat;
    }
    
    @Override
    public int compareTo(DoanhNghiep o){
        if(o.getSoLuong()!=this.soLuong){
            return o.getSoLuong()-this.soLuong;
        }
        else{
            return vietTat.compareTo(o.getVietTat());
        }
    }
    @Override
    public String toString() {
        return vietTat + " " + tenDN + " " + soLuong;
    }
    
}
