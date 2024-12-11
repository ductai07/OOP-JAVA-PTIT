 /*Cho dữ liệu dạng luồng văn bản với không quá 1 triệu từ, mỗi từ không quá 100 ký tự. 
 Hãy tìm và in ra từ dài nhất.
Nếu có nhiều từ dài nhất thì in ra từ đầu tiên.

Input
Luồng văn bản. Cần đọc đến hết luồng vào.
Output
Ghi ra từ dài nhất đầu tiên, dấu gạch ngang, sau đó đến độ dài.
Ví dụ
Input
Output

Lap trinh C++

Cau truc du lieu va giai do

trinh - 5
 */
 import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > res.length()) {
                res = word;
            }
        }
        
        sc.close();
        
        System.out.println(res + " - " + res.length());
    }
}