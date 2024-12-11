
package J07051;


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<KhachHang> kh_list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            String soPhong = sc.nextLine ();
            String ngayNhanPhong = sc.nextLine().trim();
            String ngayTraphong= sc.nextLine().trim();
            long dvPhatSinh = Long.parseLong(sc.nextLine());
            KhachHang a = new KhachHang(hoten, soPhong, ngayNhanPhong, ngayTraphong, dvPhatSinh);
            kh_list.add(a);
        }
        Collections.sort(kh_list);
        for(KhachHang a : kh_list){
            System.out.println(a);
        }
    }
}
