/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023_LIET_KE_SV_THEO_KHÓA;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String maSV=sc.nextLine();
            String hoTen =sc.nextLine();
            String lop=sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(maSV, hoTen, lop, email);
            sv_list.add(a);
        }
        int q = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=q;i++){
            String nienkhoa =sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+nienkhoa+":");
            nienkhoa=nienkhoa.substring(2);
            for(int k=0;k<sv_list.size();k++){
                String lop=sv_list.get(k).getLop().substring(1,3);
                if(lop.equals(nienkhoa)){
                    System.out.println(sv_list.get(k));
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015