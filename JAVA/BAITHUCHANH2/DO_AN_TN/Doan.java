package BAITHUCHANH2.DO_AN_TN;

public class Doan implements Comparable<Doan> {
    private Sinhvien sinhvien;
    private String tenDoan;
    private Giangvien giangvien;

    public Doan(Sinhvien sinhvien, String tenDoan, Giangvien giangvien) {
        this.sinhvien = sinhvien;
        this.tenDoan = tenDoan;
        this.giangvien = giangvien;
    }

    public String getMaSinhvien() {
        return sinhvien.getMa();
    }

    public String getTenSinhvien() {
        return sinhvien.getTen();
    }

    public String getTenGiangvien() {
        return giangvien.getTen();
    }

    public String getTenDoan() {
        return tenDoan;
    }

    public String getSdtSinhvien() {
        return sinhvien.getSdt();
    }

    @Override
    public String toString() {
        return getMaSinhvien() + " " + getTenSinhvien() + " " + getTenGiangvien() + " " + getTenDoan() + " " + getSdtSinhvien();
    }

    @Override
    public int compareTo(Doan o) {
        return this.getMaSinhvien().compareTo(o.getMaSinhvien());
    }
}