/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05043_TINH_THU_NHAP_NV;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        ArrayList<NhanVien> nv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String hoten =sc.nextLine();
            String chucvu=sc.nextLine();
            int luongcb=sc.nextInt();
            int ngaycong=sc.nextInt();
            sc.nextLine();
            NhanVien a = new NhanVien(hoten,chucvu,luongcb,ngaycong);
            nv_list.add(a);
        }
        for(NhanVien a : nv_list){
            System.out.println(a);
        }
    }
    
}
