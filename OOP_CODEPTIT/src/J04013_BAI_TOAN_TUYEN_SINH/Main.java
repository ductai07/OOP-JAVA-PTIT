package J04013_BAI_TOAN_TUYEN_SINH;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ma=sc.nextLine();
        String ten=sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLi=sc.nextDouble();
        double diemHoa=sc.nextDouble();
        ThiSinh a=new ThiSinh(ma,ten,diemToan,diemLi,diemHoa);
        System.out.println(a);
    }
}
