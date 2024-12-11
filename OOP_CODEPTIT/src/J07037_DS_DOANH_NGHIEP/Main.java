package J07037_DS_DOANH_NGHIEP;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int t= sc.nextInt();
        ArrayList<DoanhNghiep> dn_list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String maDN=sc.nextLine();
            String tenDn=sc.nextLine();
            int sl=sc.nextInt();
            DoanhNghiep a = new DoanhNghiep(maDN,tenDn,sl);
            dn_list.add(a);
        }
        Collections.sort(dn_list);
        for(DoanhNghiep a:dn_list){
            System.out.println(a);
        }
    }
}
