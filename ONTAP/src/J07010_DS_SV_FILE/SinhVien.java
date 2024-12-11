
package J07010_DS_SV_FILE;

/**
 *
 * @author ASUS
 */

public class SinhVien {
    private String maSV,ten,lop,ngaySinh;
    private double gpa;
    private static int cnt =0;
    public SinhVien(String ten, String lop, String ngaySinh, double gpa) {
        cnt++;
        this.maSV = String.format("B20DCCN%03d",cnt);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void chuanHoaNS() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        ngaySinh = sb.toString();
    }
    @Override
    public String toString(){
        chuanHoaNS();
        return maSV+" "+ten+" "+lop+" "+ngaySinh+" "+String.format("%.2f",gpa);
    }
    
}
