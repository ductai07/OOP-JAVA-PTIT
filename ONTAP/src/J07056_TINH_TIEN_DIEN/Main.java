/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07056_TINH_TIEN_DIEN;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<KhachHang> kh_list = new ArrayList<>();
        for(int i =1;i<=t;i++){
            String ten = sc.nextLine();
            String loai = sc.next();
            int dau = sc.nextInt();
            int cuoi = sc.nextInt();
            sc.nextLine();
            KhachHang a = new KhachHang(ten, loai, dau, cuoi);
            kh_list.add(a);
        }
        Collections.sort(kh_list);
        for(KhachHang A : kh_list){
            System.out.println(A);
    }
    }
}
    
//2
// nGuyEn Hong Ngat
//C 200 278
// Cu thi    minh
//A 120 160