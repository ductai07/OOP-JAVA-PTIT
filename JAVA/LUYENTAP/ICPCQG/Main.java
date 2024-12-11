package LUYENTAP.ICPCQG;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int num = Integer.parseInt(sc.nextLine() );
        Map<String, Institution> mp = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String[] parts = sc.nextLine().split(" ", 2);
            String shortName = parts[0];
            String fullName = parts[1];
            mp.put(shortName, new Institution(shortName, fullName));
        }

        sc = new Scanner(new File("REGISTER.in"));
        int soTeam = Integer.parseInt(sc.nextLine() );
        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < soTeam; i++) {
            String[] parts = sc.nextLine().split(" ");
            String shortName = parts[0];
            int numTeams = Integer.parseInt(parts[1]);
            Institution institution = mp.get(shortName);
            for (int j = 0; j < numTeams; j++) {
                String teamName = sc.nextLine().trim();
                teamList.add(new Team(teamName, institution.getFullName()));
            }
        }

        Collections.sort(teamList);

        for (int i = 0; i < teamList.size(); i++) {
            Team team = teamList.get(i);
            System.out.printf("team%02d %s %s%n", i + 1, team.getName(), team.getInstitutionFullName());
        }
    }
}