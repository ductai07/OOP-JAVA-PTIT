/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt(); 
        sc.nextLine();
        List<ThiSinh> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            double diemThi = sc.nextDouble(); sc.nextLine();
            String danToc = sc.nextLine();
            String khuvuc = sc.nextLine();
            ThiSinh a = new ThiSinh(hoten, diemThi, danToc, khuvuc);
            list.add(a);
             
        }
        Collections.sort(list);
        for(ThiSinh a : list){
            System.out.println(a);
        }
    }
}
