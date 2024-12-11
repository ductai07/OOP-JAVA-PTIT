package BAITHUCHANH2.DO_AN_TN;

import java.util.ArrayList;
import java.util.List;

public class Giangvien {
    private String ten;
    private List<Doan> doanList;

    public Giangvien(String ten) {
        this.ten = ten;
        this.doanList = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public void addDoan(Doan doan) {
        doanList.add(doan);
    }

    public List<Doan> getDoanList() {
        return doanList;
    }
}