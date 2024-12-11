package LUYENTAP.ICPC;

public class ThiSinh implements Comparable<ThiSinh> {
    private String maThiSinh, tenThiSinh, maTeam;
    private static int idCounter = 1;

    public ThiSinh(String tenThiSinh, String maTeam) {
        this.maThiSinh = String.format("C%03d", idCounter++);
        this.tenThiSinh = tenThiSinh;
        this.maTeam = maTeam;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public String getMaTeam() {
        return maTeam;
    }

    @Override
    public int compareTo(ThiSinh other) {
        return this.tenThiSinh.compareTo(other.tenThiSinh);
    }
}