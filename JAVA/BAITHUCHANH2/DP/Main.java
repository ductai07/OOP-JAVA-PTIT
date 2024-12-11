package BAITHUCHANH2.DP;

import java.util.*;
import java.io.*;
public class Main {
    private static final List<Dangki> Colections = null;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();  
        Map<String, Sinhvien> all_sv = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine(),name = sc.nextLine(),className = sc.nextLine(),email = sc.nextLine(),phone = sc.nextLine(),gender = sc.nextLine();
            all_sv.put(id, new Sinhvien(id, name, className, email, phone, gender));
        }
        sc = new Scanner(new File("DANGKY.in"));
        List<Dangki> dk = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().split("\\s+");
            dk.add(new Dangki(s[0], s[1]));
        }

        sc = new Scanner(new File("TRUYVAN.in"));
        int queryCount = sc.nextInt();
        sc.nextLine();  
        List<String[]> queries = new ArrayList<>();
        for (int i = 0; i < queryCount; i++) {
            queries.add(sc.nextLine().trim().split("\\s+"));
        }

        for (String[] query : queries) {
            String gender = query[0];
            String size = query[1];
            List<Sinhvien> result = new ArrayList<>();

            for (Dangki reg : dk) {
                Sinhvien sv = all_sv.get(reg.getStudentId());
                if (sv.getGender().equals(gender) && reg.getSize().equals(size)) {
                    result.add(sv);
                }
            }

            result.sort(Comparator.comparing(Sinhvien::getId));
            System.out.println("DANH SACH SINH VIEN " + gender.toUpperCase() + " DANG KY SIZE " + size.toUpperCase());
            for(Sinhvien s:result){
                System.out.println(s);
            }
        }
    }
}