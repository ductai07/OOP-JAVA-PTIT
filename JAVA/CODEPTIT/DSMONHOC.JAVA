import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MonHoc {
    String maMon,tenMon;
    int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi;
    }
}
public class DSMONHOC {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> danhSachMonHoc = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            danhSachMonHoc.add(new MonHoc(maMon, tenMon, soTinChi));
        }
        sc.close();

         Collections.sort(danhSachMonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.tenMon.compareTo(o2.tenMon);
            }
        });

         for (MonHoc monHoc : danhSachMonHoc) {
            System.out.println(monHoc);
        }
    }
}