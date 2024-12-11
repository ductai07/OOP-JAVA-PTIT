package Bai13;

import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<SinhVien> sv_list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String hoten = sc.nextLine();
            String thoigianbatdau = sc.nextLine();
            String thoigianketthuc = sc.nextLine();
            SinhVien a = new SinhVien(hoten, thoigianbatdau, thoigianketthuc);
            sv_list.add(a);
        }
        Collections.sort(sv_list);
        for(SinhVien a:sv_list){
            System.out.println(a);
        }
    }
}
//3
//Do Viet Anh
//11/12/2021 16:35:00
//11/12/2021 17:35:00
//Le Tuan Anh
//11/12/2021 16:45:00
//11/12/2021 18:15:00
//Nguyen Tuan Anh
//11/12/2021 17:00:00
//11/12/2021 19:15:00