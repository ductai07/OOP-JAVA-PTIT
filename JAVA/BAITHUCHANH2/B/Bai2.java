package BAITHUCHANH2.B;

import java.util.*;

public class Bai2 {
    public static void add(StringBuilder sb, int start, int end) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(end);
        }
    }
    public static String chuanhoa(List<Integer> sp) {
        if (sp.isEmpty()) {
            return "";
        }
        Collections.sort(sp);
        StringBuilder sb = new StringBuilder();
        int start = sp.get(0);
        int end = start;

        for (int i = 1; i < sp.size(); i++) {
            if (sp.get(i) == end + 1){
                end = sp.get(i);
            }
             else {
                add(sb, start, end);
                start = sp.get(i);
                end = start;
            }
        }
        add(sb, start, end);

        int last_idx=sb.lastIndexOf(", ");
        if(last_idx!=-1) sb.replace(last_idx, last_idx+2, " and ");

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> sp_loi = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            sp_loi.add(sc.nextInt());
        }
        List<Integer> sp_chuan = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!sp_loi.contains(i)) {
                sp_chuan.add(i);
            }
        }
        System.out.println("Errors: " + chuanhoa(sp_loi));
        System.out.println("Correct: " + chuanhoa(sp_chuan));
    }

}