package LUYENTAP;

import java.util.*;
import java.io.*;

public class TienTo {
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static long check(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        for (int i = tokens.length - 1; i >= 0; i--) {
            if (!isOperator(tokens[i])) {
                stack.push(Long.parseLong(tokens[i]));
            } else {
                long op1  = stack.pop();
                long op2  = stack.pop();
                long result = 0;
                switch (tokens[i]) {
                    case "+":
                        result = op1  + op2 ;
                        break;
                    case "-":
                        result = op1  - op2;
                        break;
                    case "*":
                        result = op1  * op2;
                        break;
                    case "/":
                        result = op1  / op2;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();  
            String s = sc.nextLine();
            String[] tokens = s.split(" ");
            System.out.println(check(tokens));
        }
        sc.close();
    }
}