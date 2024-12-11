package LUYENTAP.ICPC;

public class Team {
    private String maTeam, tenTeam, tenTruong;
    private static int idCounter = 1;

    public Team(String tenTeam, String tenTruong) {
        this.maTeam = String.format("Team%02d", idCounter++);
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public String getTenTeam() {
        return tenTeam;
    }

    public String getTenTruong() {
        return tenTruong;
    }
}