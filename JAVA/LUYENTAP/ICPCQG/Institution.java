package LUYENTAP.ICPCQG;

public class Institution {
    private String shortName;
    private String fullName;

    public Institution(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }
}