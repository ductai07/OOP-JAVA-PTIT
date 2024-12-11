package BAI_THUC_HANH3.A;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, hoTen, lop, email, soDT;
    public SinhVien(String maSV, String hoTen, String lop, String email, String soDT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.soDT = xuli(soDT);
    }
    private String xuli(String soDT) {
        if(soDT.charAt(0)!='0')
            return "0"+soDT;
        else return soDT;
    }
    public String getLop() {
        return lop;
    }
    public String getMaSV() {
        return maSV;
    }
    @Override
    public int compareTo(SinhVien o) {
        if (!this.lop.equals(o.lop)) {
            return this.lop.compareTo(o.lop);
        }
        return this.maSV.compareTo(o.maSV);
    }

    @Override
    public String toString() {
        return  maSV+" "+ hoTen +" " +lop+" "+ email+" "+ soDT;
    }
}