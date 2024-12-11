package J07034;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> mh_list = new ArrayList<>();
        int t= sc.nextInt();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String maMH=sc.nextLine();
            String tenMH=sc.nextLine();
            int tinchi=sc.nextInt();
            MonHoc a = new MonHoc(maMH,tenMH,tinchi);
            mh_list.add(a);
        }
        Collections.sort(mh_list);
        for(MonHoc a:mh_list){
            System.out.println(a);
        }
    }
}
