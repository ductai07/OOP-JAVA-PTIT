package Bai13;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SinhVien {
    private String hoTen;
    private LocalDateTime thoigianBatdau, thoigianKetthuc;
    private long thoigianOnl;

    public SinhVien(String hoTen, String thoigianBatdau, String thoigianKetthuc) {
        this.hoTen = hoTen;

        // Định dạng ngày giờ sử dụng LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.thoigianBatdau = LocalDateTime.parse(thoigianBatdau, formatter);
        this.thoigianKetthuc = LocalDateTime.parse(thoigianKetthuc, formatter);

        // Tính số phút giữa thời gian bắt đầu và kết thúc
        this.thoigianOnl = ChronoUnit.MINUTES.between(this.thoigianBatdau, this.thoigianKetthuc);
    }

    public String getHoTen() {
        return hoTen;
    }

    public long getThoigianOnl() {
        return thoigianOnl;
    }

    // Phương thức compareTo nếu cần sắp xếp theo thời gian online
    public int compareTo(SinhVien other) {
        if (this.thoigianOnl != other.thoigianOnl) {
            return Long.compare(other.thoigianOnl, this.thoigianOnl); // Sắp xếp giảm dần theo thời gian online
        }
        return this.hoTen.compareTo(other.hoTen); // Nếu số phút online bằng nhau, so sánh theo tên
    }
}
