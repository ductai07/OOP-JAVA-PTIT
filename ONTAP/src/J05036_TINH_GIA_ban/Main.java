/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05036_TINH_GIA_ban;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<MatHang> mh_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String tenHang = sc.nextLine();
            String donviTinh = sc.nextLine();
            int dongianhap=sc.nextInt();
            int soluong = sc.nextInt();
            sc.nextLine();
            MatHang a = new MatHang(tenHang, donviTinh, dongianhap, soluong);
            mh_list.add(a);
        }
        Collections.sort(mh_list);
        for(MatHang a : mh_list){
            System.out.println(a);
        }
    }
    
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430