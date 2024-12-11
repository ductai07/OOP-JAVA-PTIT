/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> sp_list = new ArrayList<>();
        List<HoaDon> hd_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String masp = sc.nextLine();
            String tensp = sc.nextLine();
            long dongia1 = Long.parseLong(sc.nextLine());
            long dongia2 = Long.parseLong(sc.nextLine());
            SanPham a = new SanPham(masp, tensp, dongia1, dongia2);
            sp_list.add(a);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=q;i++){
            String[] tokens = sc.nextLine().split(" ");
            String tmp = tokens[0];
            String masp = tokens[0].substring(0, 2);
            int loaisp = Integer.parseInt(tmp.substring(2));
            int soluong = Integer.parseInt(tokens[1]);
            long tongtien = 0;
            long giamgia = 0;
            SanPham res = null;
            for(int j = 0;j<sp_list.size();j++){
                if(masp.equals(sp_list.get(j).getMaloai())){
                    if(loaisp == 1){
                        tongtien = sp_list.get(j).getDongialoai1()*soluong;
                    }
                    else tongtien = sp_list.get(j).getDongialoai2()*soluong;
                    if(soluong>=150) giamgia = (long) (0.5* tongtien) ;
                        else if(soluong>=100) giamgia =(long) (0.3*tongtien);
                        else giamgia = (long) (0.15*tongtien);
                    tongtien = tongtien-giamgia;
                    res = sp_list.get(j);
                    break;
                }
                
            }
            String madon = String.format("%03d", i);
            tmp = tmp+"-"+madon;
            HoaDon a = new HoaDon(tmp,res,giamgia,tongtien);
            hd_list.add(a);
            
        }
        for(HoaDon a : hd_list){
            System.out.println(a);
        }
        
    }
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105