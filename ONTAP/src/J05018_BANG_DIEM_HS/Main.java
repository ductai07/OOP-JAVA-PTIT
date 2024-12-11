/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018_BANG_DIEM_HS;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HocSinh> hs_list = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String hoten=sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();
            double d4 = sc.nextDouble();
            double d5 = sc.nextDouble();
            double d6 = sc.nextDouble();
            double d7 = sc.nextDouble();
            double d8 = sc.nextDouble();
            double d9 = sc.nextDouble();
            double d10 = sc.nextDouble();
            sc.nextLine();
            HocSinh a = new HocSinh(hoten, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
            hs_list.add(a);
            
            
        }
        Collections.sort(hs_list);
        for(HocSinh a:hs_list){
            System.out.println(a);
        }
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
