
package J05004;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> sv_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            String lop =sc.nextLine();
            String birth=sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien a = new SinhVien(ten,lop,birth,gpa);
            sv_list.add(a);
        }
        for (SinhVien a : sv_list){
            System.out.println(a);
        }
    }
    
}
