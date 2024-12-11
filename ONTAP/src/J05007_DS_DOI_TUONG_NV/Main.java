/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007_DS_DOI_TUONG_NV;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<NhanVien> nv_list = new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String hoTen = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diachi =sc.nextLine();
            String maThue = sc.nextLine();
            String ngaykihd = sc.nextLine();
            NhanVien a = new NhanVien(hoTen, gioitinh, ngaySinh, diachi, maThue, ngaykihd);
            nv_list.add(a);
        }
        Collections.sort(nv_list);
        for(NhanVien nv:nv_list){
            System.out.println(nv);
        }
    }
    
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011