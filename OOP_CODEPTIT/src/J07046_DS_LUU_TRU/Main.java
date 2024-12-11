package J07046_DS_LUU_TRU;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<KhachHang> kh_list = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String hoTen=sc.nextLine();
            String maPhong=sc.nextLine();
            String ngayDen=sc.nextLine();
            String ngayDi=sc.nextLine();
            KhachHang a= new KhachHang(hoTen,maPhong,ngayDen,ngayDi);
            kh_list.add(a);
        }
        Collections.sort(kh_list);
        for(KhachHang a:kh_list){
            System.out.println(a);
        }
    }
}
