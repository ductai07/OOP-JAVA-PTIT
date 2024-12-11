
package J07010_DS_SV_FILE;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.io.*;
public class Main {
     public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        List<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double gpa = sc.nextDouble();
            
            SinhVien a = new SinhVien(ten, lop, ngaysinh, gpa);
            sv_list.add(a);
        }
        for(SinhVien a : sv_list){
            System.out.println(a);
        }
        
    }
}
//2
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19