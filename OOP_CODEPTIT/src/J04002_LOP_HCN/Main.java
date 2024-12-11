package J04002_LOP_HCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN a = new HCN();
        double h = sc.nextDouble();
        a.setWight(h);
        double hh = sc.nextDouble();
        a.setHeight(hh);
        String s = sc.next().toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        a.setColor(s);
        if(a.getHeight()>0 && a.getWight()>0){
            System.out.printf("%.0f %.0f %s",a.findPerimeter(),a.findArea(),a.getColor());
        }
        else{
            System.out.println("INVALID");
        }

    }

}
