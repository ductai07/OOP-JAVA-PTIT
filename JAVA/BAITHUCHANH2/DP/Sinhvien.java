package BAITHUCHANH2.DP;

public class Sinhvien {
    private String id;
    private String name;
    private String className;
    private String email;
    private String phone;
    private String gender;

    public Sinhvien(String id, String name, String className, String email, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email + " " + phone;
    }
}
