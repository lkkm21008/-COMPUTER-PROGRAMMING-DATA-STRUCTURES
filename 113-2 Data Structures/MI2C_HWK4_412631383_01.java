/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.*;

public class MI2C_HWK4_412631383_01 {
    public static void main(String[] args) {
        String exp = "8.5 - ( 6 + 3 * 4 ) / 3.5"; // 中置式
        System.out.println("exp=" + exp);

        String postfix = infixToPostfix(exp); // 轉換後置式
        System.out.println("postfix=" + postfix); // 印出後置式

        double rlt = evalPostfixExp(postfix); // 計算後置式的值
        System.out.println("rlt=" + rlt);
    }

    public static String infixToPostfix(String infix) {
        StringBuilder output = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] tokens = infix.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+(\\.\\d+)?")) { // 若為數字
                output.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop(); // 移除左括號
            } else if (isOperator(token)) { // 運算子
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        return output.toString().trim();
    }

    public static double evalPostfixExp(String postfix) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+(\\.\\d+)?")) { // 若為數字
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) { // 若為運算子
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "%": stack.push(a % b); break;
                }
            }
        }
        return stack.pop();
    }

    public static int precedence(String opr) {
        if (opr.equals("+") || opr.equals("-")) return 1;
        else if (opr.equals("*") || opr.equals("/") || opr.equals("%")) return 2;
        else return 0;
    }

    public static boolean isOperator(String token) {
        return "+-*/%".contains(token);
    }
}