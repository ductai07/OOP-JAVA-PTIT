
package J05005_DS_DOI_TUONG_SV3;

/**
 *
 * @author ASUS
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV,hoTen,lop,ngaySinh;
    private double gpa;
    private static int cnt =0;

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        cnt++;
        this.maSV = String.format("B20DCCN%03d", cnt);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    private String chuanhoaHoten(){
        String res="";
        String[] tokens = hoTen.toLowerCase().trim().split("\\s+");
        for(String tok : tokens){
            res+= Character.toUpperCase(tok.charAt(0))+ tok.substring(1)+" ";
            
        }
        return res.trim();
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

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(SinhVien o) {
                return Double.compare(o.getGpa(), this.gpa);
            }
    @Override
    public String toString(){
        String hoten=chuanhoaHoten();
        chuanHoaNS();
        return  maSV+" "+ hoten +" "+lop+" "+ ngaySinh +" "+ String.format("%.2f",gpa);
    }
    
    
     
    
    
}
