package LUYENTAP.ICPCQG;

public class Team implements Comparable<Team> {
    private String name;
    private String institutionFullName;

    public Team(String name, String institutionFullName) {
        this.name = name;
        this.institutionFullName = institutionFullName;
    }

    public String getName() {
        return name;
    }

    public String getInstitutionFullName() {
        return institutionFullName;
    }

    @Override
    public int compareTo(Team other) {
        int cmp = this.institutionFullName.compareTo(other.institutionFullName);
        if (cmp != 0) {
            return cmp;
        }
        return this.name.compareTo(other.name);
    }
}