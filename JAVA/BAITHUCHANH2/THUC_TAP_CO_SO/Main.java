package BAITHUCHANH2.THUC_TAP_CO_SO;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int soSinhvien = Integer.parseInt(sc.nextLine());
        List<Sinhvien> sinhvienList = new ArrayList<>();
        for (int i = 0; i < soSinhvien; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            sinhvienList.add(new Sinhvien(ma, ten, sdt, email));
        }

        sc = new Scanner(new File("DETAI.in"));
        int soDetai = Integer.parseInt(sc.nextLine());
        List<Detai> detaiList = new ArrayList<>();
        for (int i = 0; i < soDetai; i++) {
            String tenGiangvien = sc.nextLine() ;
            String tenDetai = sc.nextLine() ;
            detaiList.add(new Detai(tenGiangvien, tenDetai));
        }

        sc = new Scanner(new File("NHIEMVU.in"));
        int soNhiemvu = Integer.parseInt(sc.nextLine() );
        List<Nhiemvu> nhiemvuList = new ArrayList<>();
        for (int i = 0; i < soNhiemvu; i++) {
            String[] nvInfo = sc.nextLine().split("\\s+");
            String maSinhvien = nvInfo[0];
            String maDetai = nvInfo[1];

            Sinhvien sinhvien = null;
            for (Sinhvien sv : sinhvienList) {
                if (sv.getMa().equals(maSinhvien)) {
                    sinhvien = sv;
                    break;
                }
            }

            Detai detai = null;
            for (Detai dt : detaiList) {
                if (dt.getMa().equals(maDetai)) {
                    detai = dt;
                    break;
                }
            }

            if (sinhvien != null && detai != null) {
                nhiemvuList.add(new Nhiemvu(sinhvien, detai));
            }
        }

        Collections.sort(nhiemvuList);

        for (Nhiemvu nv : nhiemvuList) {
            System.out.println(nv);
        }
    }
}