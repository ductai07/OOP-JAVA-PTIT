package LOG_THOI_GIAN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thoigian hj = new Thoigian();
        hj.Log(sc);
        hj.print();
    }
}