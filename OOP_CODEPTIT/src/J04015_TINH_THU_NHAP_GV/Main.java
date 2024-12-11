package J04015_TINH_THU_NHAP_GV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Giaovien a= new Giaovien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        String tmp=a.getMa();
        long pc=0;
        if(tmp.substring(0, 2).equals("HT")) {
            pc = 2000000;
        } 
        else if(tmp.substring(0, 2).equals("HP")) {
            pc = 900000;
        } else {
            pc = 500000;
        }
        String heso="";
        String heso_tmp=tmp.substring(2);
        if(heso_tmp.charAt(0)=='0') heso =Character.toString(heso_tmp.charAt(1));
        else heso=heso_tmp; 
        long luong=a.getLuong()*Integer.parseInt(heso)+pc;
        System.out.println( a.getMa() +" "+a.getTen()+" "+heso+" "+pc+" "+luong);
        
    }
}
