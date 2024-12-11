package LUYENTAP.ICPC;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int soTeam = Integer.parseInt(sc.nextLine());
        Map<String, Team> teamMap = new HashMap<>();
        for (int i = 0; i < soTeam; i++) {
            String tenTeam = sc.nextLine() ;
            String tenTruong = sc.nextLine() ;
            Team team = new Team(tenTeam, tenTruong);
            teamMap.put(team.getMaTeam(), team);
        }

        int soThiSinh = Integer.parseInt(sc.nextLine() );
        List<ThiSinh> thiSinhList = new ArrayList<>();
        for (int i = 0; i < soThiSinh; i++) {
            String tenThiSinh = sc.nextLine() ;
            String maTeam = sc.nextLine() ;
            ThiSinh thiSinh = new ThiSinh(tenThiSinh, maTeam);
            thiSinhList.add(thiSinh);
        }

 
        Collections.sort(thiSinhList);
        for (ThiSinh thiSinh : thiSinhList) {
            Team team = teamMap.get(thiSinh.getMaTeam());
            System.out.println(thiSinh.getMaThiSinh() + " " + thiSinh.getTenThiSinh() + " " + team.getTenTeam() + " " + team.getTenTruong());
        }
        
        sc.close();
    }
}