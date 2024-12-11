import java.util.*;

class SinhVien {
    private String maSinhVien,hoTen,lop,email,SoDienThoai;
    
    public SinhVien(String maSinhVien, String hoTen, String lop, String email, String SoDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.SoDienThoai = "0" + SoDienThoai;  
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getLop() {
        return lop;
    }
    public String getEmail() {
        return email;
    }
    public String getSoDienThoai() {
        return SoDienThoai;
    }
    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + lop + " " + email + " " + SoDienThoai;
    }
}
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sinhVienList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String maSinhVien = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String soDienThoai = sc.nextLine();
            sinhVienList.add(new SinhVien(maSinhVien, hoTen, lop, email, soDienThoai));
        }

        sinhVienList.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (!sv1.getLop().equals(sv2.getLop())) {
                    return sv1.getLop().compareTo(sv2.getLop());
                } else {
                    return sv1.getMaSinhVien().compareTo(sv2.getMaSinhVien());
                }
            }
        });

        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }

        sc.close();
    }
}