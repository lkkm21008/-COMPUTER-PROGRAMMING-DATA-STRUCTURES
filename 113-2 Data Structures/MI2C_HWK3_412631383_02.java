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

class Brace {
    public static final Brace NULL_BRACE = new Brace(' ', 0);
    char c; // 儲存 { 或 } 字元
    int pos; // 儲存出現的位置

    Brace(char c, int p) {
        this.c = c;
        this.pos = p;
    }
}
public class MI2C_HWK3_412631383_02 {
     public static void main(String[] args) {
        System.out.println("Input test string for balance check");
        String s = "{abc{de{fgh@-}}kk}"; 
        // String s = "{xy{abc{de{fgh@-}kk}"; // 位置3的{沒有可匹配的}
        // String s = "{abc de fgh@-}}kk}"; // 位置14的}沒有可匹配的{
        System.out.println(s);

        Brace brace = balanceCheck(s);
        if (brace == Brace.NULL_BRACE) {
            System.out.println("{} balance check passed.");
        } else {
            System.out.println("錯誤位置：" + brace.pos);
            if (brace.c == '{') {
                System.out.println("錯誤原因：缺少對應的 '}'");
            } else {
                System.out.println("錯誤原因：缺少對應的 '{'");
            }
        }
    }

    public static Brace balanceCheck(String s) {
        Stack<Brace> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{') {
                stk.push(new Brace(c, i));
            } else if (c == '}') {
                if (stk.isEmpty()) {
                    return new Brace(c, i); // 沒有對應的 `{`
                }
                stk.pop(); // 配對成功，移除 `{`
            }
        }

        if (!stk.isEmpty()) {
            return stk.pop(); // 代表還有未匹配的 `{`
        }

        return Brace.NULL_BRACE; // 全部匹配成功
    }
}
