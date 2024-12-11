
package J05005_DS_DOI_TUONG_SV3;

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
        List<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String hoten=sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            sc.nextLine();
            SinhVien a = new SinhVien(hoten, lop, ngaySinh, gpa);
            sv_list.add(a);
           
        }
        Collections.sort(sv_list);
        for(SinhVien a : sv_list){
            System.out.println(a) ;
        }
    }
}
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
