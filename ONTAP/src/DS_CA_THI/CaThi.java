package DS_CA_THI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable<CaThi> {
    private String maCa;
    private String ngayThi;
    private String gioThi;
    private String phongThi;
    private Date thoiGianThi;

    public CaThi(int stt, String ngayThi, String gioThi, String phongThi) {
        this.maCa = String.format("C%03d", stt);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            this.thoiGianThi = sdf.parse(ngayThi + " " + gioThi);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(CaThi other) {
        int timeCompare = this.thoiGianThi.compareTo(other.thoiGianThi);
        if (timeCompare != 0) {
            return timeCompare;
        }
        return this.maCa.compareTo(other.maCa);
    }

    @Override
    public String toString() {
        return maCa + " " + ngayThi + " " + gioThi + " " + phongThi;
    }
}