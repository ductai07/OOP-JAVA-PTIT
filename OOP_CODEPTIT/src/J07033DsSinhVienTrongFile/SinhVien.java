package J07033DsSinhVienTrongFile;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, hoTen, lop, email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void chuanhoa() {
        StringBuilder res = new StringBuilder();
        hoTen = hoTen.toLowerCase().trim();
        String[] tokens = hoTen.split("\\s+");
        for (String tok : tokens) {
            res.append(Character.toUpperCase(tok.charAt(0)))
                    .append(tok.substring(1))
                    .append(" ");
        }
        hoTen = res.toString().trim();
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.getMaSV());
    }

    @Override
    public String toString() {
        chuanhoa();
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}
