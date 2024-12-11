package J04013_BAI_TOAN_TUYEN_SINH;

public class ThiSinh {
    private String maThiSinh,hoTen,trangThai;
    private double diemToan,diemLi,diemHoa,diemUuTien,diemAll;

    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLi, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
        this.diemUuTien=0;
        this.diemAll=0;
        this.trangThai="";
    }
    public void tinhDiem() {
        String tmp = maThiSinh.substring(0, 3);
        if (tmp.equals("KV1")) diemUuTien = 0.5;
        else if (tmp.equals("KV2")) diemUuTien = 1.0;
        else diemUuTien = 2.5;

        this.diemAll = diemToan * 2 + diemLi + diemHoa + diemUuTien;
        this.trangThai = (diemAll >= 24) ? "TRUNG TUYEN" : "TRUOT";
    }
    @Override
    public String toString() {
        tinhDiem();
        String diemUuTienStr = (diemUuTien == (int) diemUuTien)
                ? String.valueOf((int) diemUuTien)
                : String.format("%.1f", diemUuTien);
        return maThiSinh + " " + hoTen + " " + diemUuTienStr
                + " " + String.format("%.1f", diemAll) + " " + trangThai;
    }

}
