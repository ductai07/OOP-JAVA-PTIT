package J05018_BANG_DIEM_HS;

public class HocSinh implements Comparable<HocSinh> {
    private String maHS, hoTen, xepLoai;
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, trungBinh;
    private static int cnt = 0;

    public HocSinh(String hoTen, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        cnt++;
        this.maHS = String.format("HS%02d", cnt);
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
        xuli();
    }

    private void xuli() {
        // Áp dụng hệ số 2 cho Toán (d1) và Tiếng Việt (d2)
        double tongDiem = (d1 * 2) + (d2 * 2) + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10;
        trungBinh = (double)Math.round(tongDiem/12*10)/10; 

        // Xếp loại dựa trên trung bình
        if (trungBinh >= 9.0) {
            xepLoai = "XUAT SAC";
        } else if (trungBinh >= 8.0) {
            xepLoai = "GIOI";
        } else if (trungBinh >= 7.0) {
            xepLoai = "KHA";
        } else if (trungBinh >= 5.0) {
            xepLoai = "TB";
        } else {
            xepLoai = "YEU";
        }
    }

    public double getTrungBinh() {
        return trungBinh;
    }

    public String getMaHS() {
        return maHS;
    }
    

    @Override
    public int compareTo(HocSinh o) {
        
        if (Double.compare(o.getTrungBinh(), this.trungBinh) == 0) {
            return this.maHS.compareTo(o.getMaHS());
        }
        return Double.compare(o.getTrungBinh(), this.trungBinh);
    }

    @Override
    public String toString() {
        
        return maHS + " " + hoTen + " " + String.format("%.1f", trungBinh) + " " + xepLoai;
    }
}

