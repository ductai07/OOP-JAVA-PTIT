package J07048_DS_SAN_PHAM;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t= sc.nextInt();
        ArrayList<SanPham> sp_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String maSP=sc.nextLine();
            String tenSP=sc.nextLine();
            int gia=sc.nextInt();
            int baohanh=sc.nextInt();
            SanPham a = new SanPham(maSP,tenSP,gia,baohanh);
            sp_list.add(a);
        }
        Collections.sort(sp_list);
        for(SanPham a:sp_list){
            System.out.println(a);
        }
    }
}
