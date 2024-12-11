package BAI_THUC_HANH3.B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CongNhan> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maCN = sc.nextLine();
            String tenCN = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            ds.add(new CongNhan(maCN, tenCN, gioVao, gioRa));
        }
        Collections.sort(ds);
        for (CongNhan cn : ds) {
            System.out.println(cn);
        }
    }
}