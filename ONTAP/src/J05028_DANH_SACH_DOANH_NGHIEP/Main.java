/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05028_DANH_SACH_DOANH_NGHIEP;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep> dn_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String viettat = sc.nextLine();
            String tenDN=sc.nextLine();
            int soluong = sc.nextInt();
            sc.nextLine();
            DoanhNghiep a = new DoanhNghiep(viettat, tenDN, soluong);
            dn_list.add(a);
        }
        Collections.sort(dn_list);
        for(DoanhNghiep a : dn_list){
            System.out.println(a);
        }
    }
    
}
