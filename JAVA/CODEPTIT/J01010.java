import java.util.Scanner;

public class J01010 {
 
    public static char solve(char x) {
        if (x == '0' || x == '8' || x == '9') {
            return '0';
        } else if (x == '1') {
            return '1';
        } else {
            return 'a'; // Trả về ký tự không hợp lệ
        }
    }

 
    public static String convert(String s) {
        int idx = 0;
        // Tìm vị trí đầu tiên mà ký tự không phải '0'
        while (idx < s.length() && s.charAt(idx) == '0') {
            idx++;
        }
        return s.substring(idx); // Trả về chuỗi đã loại bỏ '0' đầu
    }

    // Hàm kiểm tra chuỗi hợp lệ
    public static boolean check(String s) {
        if (s.isEmpty() || s.contains("a")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số lượng bộ test
        sc.nextLine(); // Đọc dòng trống sau số lượng bộ test
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuilder res = new StringBuilder();
            
            boolean valid = true;
            for (int i = 0; i < s.length(); i++) {
                char tem = solve(s.charAt(i));
                if (tem == 'a') {
                    valid = false;
                    break;
                }
                res.append(tem);
            }

            if (valid) {
                String result = convert(res.toString());
                if (!check(result)) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(result);
                }
            } else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
