import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Team {
    private String teamId;
    private String teamName;
    private String university;
    public Team(String teamId, String teamName, String university) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.university = university;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getUniversity() {
        return university;
    }
}
class Contestant {
    private String contestantId;
    private String fullName;
    private String teamId;

    public Contestant(String contestantId, String fullName, String teamId) {
        this.contestantId = contestantId;
        this.fullName = fullName;
        this.teamId = teamId;
    }

    public String getContestantId() {
        return contestantId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTeamId() {
        return teamId;
    }
}

public class ICPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numTeams = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau số numTeams
        
        List<Team> teams = new ArrayList<>();
        for (int i = 1; i <= numTeams; i++) {
            String teamName = sc.nextLine();
            String university = sc.nextLine();
            teams.add(new Team(String.format("Team%02d", i), teamName, university));
        }
        
        int numContestants = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau số numContestants
        
        List<Contestant> contestants = new ArrayList<>();
        for (int i = 1; i <= numContestants; i++) {
            String fullName = sc.nextLine();
            String teamId = sc.nextLine();
            contestants.add(new Contestant(String.format("C%03d", i), fullName, teamId));
        }
        
        // Sắp xếp danh sách thí sinh theo họ tên
        Collections.sort(contestants, Comparator.comparing(Contestant::getFullName));
        
        // In ra danh sách thí sinh đã sắp xếp
        for (Contestant contestant : contestants) {
            Team team = teams.stream()
                             .filter(t -> t.getTeamId().equals(contestant.getTeamId()))
                             .findFirst()
                             .orElse(null);
            if (team != null) {
                System.out.println(contestant.getContestantId() + " " + contestant.getFullName() + " " + team.getTeamName() + " " + team.getUniversity());
            }
        }
        
        sc.close();
    }
}