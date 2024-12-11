import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

class SinhVien {
    private String hoTen,thoigianbatdau,thoigianketthuc;
     
    private long thoiLuongOnline;

    public SinhVien(String hoTen, String thoiGianBatDau, String thoiGianKetThuc) throws ParseException {
        this.hoTen = hoTen;
        this.thoigianbatdau = thoiGianBatDau;
        this.thoigianketthuc = thoiGianKetThuc;
        this.thoiLuongOnline = tinhThoiLuongOnline();
    }

    private long tinhThoiLuongOnline() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date start = sdf.parse(thoigianbatdau);
        Date end = sdf.parse(thoigianketthuc);
        long diffInMillies = end.getTime() - start.getTime();
        return TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    public String getHoTen() {
        return hoTen;
    }

    public long getThoiLuongOnline() {
        return thoiLuongOnline;
    }

    @Override
    public String toString() {
        return hoTen + " " + thoiLuongOnline;
    }
}

public class Bai14 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> sinhVienList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String thoiGianBatDau = sc.nextLine();
            String thoiGianKetThuc = sc.nextLine();
            sinhVienList.add(new SinhVien(hoTen, thoiGianBatDau, thoiGianKetThuc));
        }

        sinhVienList.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getThoiLuongOnline() != sv2.getThoiLuongOnline()) {
                    return Long.compare(sv2.getThoiLuongOnline(), sv1.getThoiLuongOnline());
                } else {
                    return sv1.getHoTen().compareTo(sv2.getHoTen());
                }
            }
        });

        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }

        sc.close();
    }
}