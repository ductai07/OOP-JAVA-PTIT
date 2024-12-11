package J05081_DS_MAT_HANG;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Mathang> mh=new ArrayList<>();
        for(int i=0;i<t;i++){
            sc.nextLine();
            String ten=sc.nextLine(),donvi=sc.nextLine();
            int giaban=sc.nextInt(),giamua=sc.nextInt();
            mh.add(new Mathang( ten, donvi, giaban, giamua));
        }
        Collections.sort(mh, new Comparator<Mathang>() {
            @Override
            public int compare(Mathang a, Mathang b) {
                if (a.getLoinhuan() == b.getLoinhuan()) {
                    return a.getMa().compareTo(b.getMa());
                }
                return b.getLoinhuan() - a.getLoinhuan();
            }
        });
        
        for ( Mathang m: mh){
            System.out.println(m);
        }
    }
}
