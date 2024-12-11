/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21C01;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            String[] tokens = sc.nextLine().split(" ");
            int sobai = Integer.parseInt(tokens[0]);
            int soluotSubmit = Integer.parseInt(tokens[1]);
            SinhVien a = new SinhVien(hoten, sobai, soluotSubmit);
            sv_list.add(a);
        }
        Collections.sort(sv_list);
        for(SinhVien a : sv_list){
            System.out.println(a);
        }
    }
}
