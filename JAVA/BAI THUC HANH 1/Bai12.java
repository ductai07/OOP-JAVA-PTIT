import java.util.*;
import java.text.*;

class TheLoai {
    private String maTheLoai;
    private String tenTheLoai;

    public TheLoai(String maTheLoai, String tenTheLoai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }
}

class Phim {
    private String maPhim;
    private String maTheLoai;
    private String ngayKhoiChieu;
    private String tenPhim;
    private int soTapPhim;

    public Phim(String maPhim, String maTheLoai, String ngayKhoiChieu, String tenPhim, int soTapPhim) {
        this.maPhim = maPhim;
        this.maTheLoai = maTheLoai;
        this.ngayKhoiChieu = ngayKhoiChieu;
        this.tenPhim = tenPhim;
        this.soTapPhim = soTapPhim;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public String getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getSoTapPhim() {
        return soTapPhim;
    }
}

public class Bai12 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau số n và m

        List<TheLoai> theLoaiList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tenTheLoai = sc.nextLine();
            String maTheLoai = String.format("TL%03d", i);
            theLoaiList.add(new TheLoai(maTheLoai, tenTheLoai));
        }

        List<Phim> phimList = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String maTheLoai = sc.next();
            String ngayKhoiChieu = sc.next();
            sc.nextLine(); // Đọc bỏ dòng trống sau ngày khởi chiếu
            String tenPhim = sc.nextLine();
            int soTapPhim = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống sau số tập phim
            String maPhim = String.format("P%03d", i);
            phimList.add(new Phim(maPhim, maTheLoai, ngayKhoiChieu, tenPhim, soTapPhim));
        }

        phimList.sort(new Comparator<Phim>() {
            @Override
            public int compare(Phim p1, Phim p2) {
                try {
                    Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p1.getNgayKhoiChieu());
                    Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(p2.getNgayKhoiChieu());
                    if (!date1.equals(date2)) {
                        return date1.compareTo(date2);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (!p1.getTenPhim().equals(p2.getTenPhim())) {
                    return p1.getTenPhim().compareTo(p2.getTenPhim());
                }
                return Integer.compare(p2.getSoTapPhim(), p1.getSoTapPhim());
            }
        });

        for (Phim phim : phimList) {
            String tenTheLoai = "";
            for (TheLoai theLoai : theLoaiList) {
                if (theLoai.getMaTheLoai().equals(phim.getMaTheLoai())) {
                    tenTheLoai = theLoai.getTenTheLoai();
                    break;
                }
            }
            System.out.printf("%s %s %s %s %d\n", phim.getMaPhim(), tenTheLoai, phim.getNgayKhoiChieu(), phim.getTenPhim(), phim.getSoTapPhim());
        }

        sc.close();
    }
}