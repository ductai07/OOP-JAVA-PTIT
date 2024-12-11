/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D21C05;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        List<Phim> lít = new ArrayList<>();
        Map<String,String > mp = new HashMap<>();
        for(int i=1;i<=n;i++){
            String theloai = sc.nextLine();
            mp.put(String.format("TL%03d",i),theloai);
        }
        for(int i=1;i<=m;i++){
            String tl = mp.get(sc.nextLine());
            String ngaychieu = sc.nextLine();
            String tenphim = sc.nextLine();
            int sotap = Integer.parseInt(sc.nextLine());
            Phim a = new Phim(tl, ngaychieu, tenphim, sotap);
            lít.add(a);
        }
        Collections.sort(lít);
        for(Phim a : lít ){
            System.out.println(a);
        }
    }
}
//2 3
//Hai huoc
//Tinh cam
//TL001
//25/11/2021
//Phim so 1
//10
//TL001
//04/12/2021
//Phim so 2
//15
//TL002
//25/11/2021
//Phim so 3
//5
