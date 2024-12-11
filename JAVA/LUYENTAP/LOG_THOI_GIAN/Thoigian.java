package LOG_THOI_GIAN;

import java.util.*;
import java.io.*;

public class Thoigian {
    private Set<String> timeSet;

    public Thoigian() {
        timeSet = new HashSet<>();
    }

    public void Log(Scanner sc) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split("[\\s,\\.]+");
            for (String token : tokens) {
                if (checktime(token)) {
                    timeSet.add(token);
                }
            }
        }
    }

    private boolean checktime(String token) {
        if (token.length() != 8) return false;
        if (token.charAt(2) != ':' || token.charAt(5) != ':') return false;
        try {
            int hh = Integer.parseInt(token.substring(0, 2));
            int mm = Integer.parseInt(token.substring(3, 5));
            int ss = Integer.parseInt(token.substring(6, 8));
            if (hh < 0 || hh > 23 || mm < 0 || mm > 59 || ss < 0 || ss > 59) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void print() {
        List<String> sortedTimes = new ArrayList<>(timeSet);
        Collections.sort(sortedTimes);
        for (String time : sortedTimes) {
            System.out.println(time);
        }
    }
}