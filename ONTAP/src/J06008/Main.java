/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> mh_list = new ArrayList<>();
        List<GiangVien> gv_list = new ArrayList<>();
        List<TinhGio> gios = new ArrayList<>();
        Map<String,String> mp1 = new LinkedHashMap<>();
        Map<String,String> mp2 = new LinkedHashMap<>();
        for(int i=1;i<=t;i++){
            String[] tokens = sc.nextLine().split(" ");
            String mamh = tokens[0];
            String tenmh = "";
            for (int j=1;j<tokens.length;j++){
                tenmh+=tokens[j]+" ";
            }
            tenmh = tenmh.trim();
            mp1.put(mamh,tenmh);
            MonHoc a = new MonHoc(mamh,tenmh);
            mh_list.add(a);
        }
        int tt  = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=tt;i++){
            String[] tokens = sc.nextLine().split(" ");
            String magv =tokens[0];
            String tengv = "";
            for(int j=1;j<tokens.length;j++){
                tengv += tokens[j]+" ";
            }
            tengv = tengv.trim();
            mp2.put(magv,tengv);
            GiangVien a = new GiangVien(magv,tengv);
            gv_list.add(a);
        }
        int ttt = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=ttt;i++){
            String[] tokens = sc.nextLine().split(" ");
            String magv = tokens[0];
            String mamh = tokens[1];
            double sogio = Double.parseDouble(tokens[2]);
            MonHoc oke = new MonHoc(mamh,mp1.get(mamh));
            GiangVien cc = new GiangVien(magv,mp2.get(magv));
            TinhGio ll = new TinhGio(oke, cc, sogio);
            gios.add(ll);
            
        }
        String kholoi = sc.next();
        double total = 0;
        for(TinhGio vl : gios  ){
            if(kholoi.equals(vl.getGv().getMaGV())){
                System.out.println(vl);
                total += vl.getTongio();
            }
        }
         System.out.println("Tong: " + String.format("%.2f", total));
    }
}
//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01
