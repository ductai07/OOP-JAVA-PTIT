package BAITHUCHANH2.THUC_TAP_CO_SO;

public class Nhiemvu implements Comparable<Nhiemvu> {
    private Sinhvien sinhvien;
    private Detai detai;

    public Nhiemvu(Sinhvien sinhvien, Detai detai) {
        this.sinhvien = sinhvien;
        this.detai = detai;
    }

    public String getMaSinhvien() {
        return sinhvien.getMa();
    }

    public String getTenSinhvien() {
        return sinhvien.getTen();
    }

    public String getSdtSinhvien() {
        return sinhvien.getSdt();
    }

    public String getEmailSinhvien() {
        return sinhvien.getEmail();
    }

    public String getTenGiangvien() {
        return detai.getTenGiangvien();
    }

    public String getTenDetai() {
        return detai.getTenDetai();
    }

    @Override
    public String toString() {
        return getMaSinhvien() + " " + getTenSinhvien() + " " + getSdtSinhvien() + " " + getEmailSinhvien() + " " + getTenGiangvien() + " " + getTenDetai();
    }

    @Override
    public int compareTo(Nhiemvu o) {
        return this.getTenDetai().compareTo(o.getTenDetai());
    }
}