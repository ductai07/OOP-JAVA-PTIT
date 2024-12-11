package BAITHUCHANH2.DO_AN_TN;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Sinhvien> sinhvienList = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            sinhvienList.add(new Sinhvien(ma, ten, lop, email, sdt));
        }

        sc = new Scanner(new File("HUONGDAN.in"));
        int soGiangvien = Integer.parseInt(sc.nextLine());
        List<Giangvien> giangvienList = new ArrayList<>();
        for (int i = 0; i < soGiangvien; i++) {
            String[] gvInfo = sc.nextLine().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < gvInfo.length - 1; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                sb.append(gvInfo[j]);
            }
            String tenGiangvien = sb.toString();
            int soDoan = Integer.parseInt(gvInfo[gvInfo.length - 1]);
            Giangvien giangvien = new Giangvien(tenGiangvien);
            for (int j = 0; j < soDoan; j++) {
                String[] doanInfo = sc.nextLine().split("\\s+", 2);
                String maSinhvien = doanInfo[0];
                String tenDoan = doanInfo[1];
                Sinhvien sinhvien = null;
                for (Sinhvien sv : sinhvienList) {
                    if (sv.getMa().equals(maSinhvien)) {
                        sinhvien = sv;
                        break;
                    }
                }
                if (sinhvien != null) {
                    Doan doan = new Doan(sinhvien, tenDoan, giangvien);
                    giangvien.addDoan(doan);
                }
            }
            giangvienList.add(giangvien);
        }

        List<Doan> doanList = new ArrayList<>();
        for (Giangvien giangvien : giangvienList) {
            doanList.addAll(giangvien.getDoanList());
        }

        Collections.sort(doanList);

        for (Doan doan : doanList) {
            System.out.println(doan);
        }
    }
}