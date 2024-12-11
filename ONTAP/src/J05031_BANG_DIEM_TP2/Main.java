/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05031_BANG_DIEM_TP2;

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
        ArrayList<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String maSV = sc.nextLine();
            String ten=sc.nextLine();
            String lop =sc.nextLine();
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            sc.nextLine();
            SinhVien a = new SinhVien(maSV, ten, lop, diem1, diem2, diem3);
            sv_list.add(a);
       
        }
        Collections.sort(sv_list);
        int cnt=1;
        for(SinhVien a : sv_list){
            System.out.print(cnt+" ");
            System.out.println(a);
            cnt++;
 
        }
    }
}
//3
//B20DCCN999
//Ngyen Van Nam
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van An
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Nguyn Van Binh
//D20CQCN01-B
//9.0
//5.0
//6.0
