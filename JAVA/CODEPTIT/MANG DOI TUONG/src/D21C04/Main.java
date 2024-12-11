package D21C04;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<HoaDon> hd_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String maMH = sc.nextLine();
            String tenMh = sc.nextLine();
            long soluong = Long.parseLong(sc.nextLine());
            long dongia = Long.parseLong(sc.nextLine());
            long chietkhau = Long.parseLong(sc.nextLine());
            new HoaDon a = new HoaDon(maMH, tenMh, soluong, dongia,chietkhau);
            hd_list.add(a);
            
        }
        Collections.sort(hd_list);
        for(HoaDon a  : hd_list ) {
            System.out.println(a);
        }
    }
}
