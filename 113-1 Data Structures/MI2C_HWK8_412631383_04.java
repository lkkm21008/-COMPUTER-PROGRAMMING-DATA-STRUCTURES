/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class MDate {
    int y, m, d; //西元紀年
    static String[] cnum = {"○", "一", "二", "三", "四", "五", "六",
                            "七", "八", "九", "十"};
    MDate() {  }

    MDate(int y, int m, int d) {
        this.y = y;   this.m = m;    this.d = d;
    }
    public static String toCNum(int num) {
        StringBuilder result = new StringBuilder();
        if (num == 10) {
            return cnum[10];
        } else if (num > 10 && num < 20) {
            result.append(cnum[10]); 
            result.append(cnum[num % 10]);
        } else if (num >= 20) {
            result.append(cnum[num / 10]); 
            result.append("十");
            if (num % 10 != 0) {
                result.append(cnum[num % 10]); 
            }
        } else {
            result.append(cnum[num]); 
        }
        return result.toString();
    }

    public String toString() {
       StringBuilder yearStr = new StringBuilder();
        for (char c : String.valueOf(y).toCharArray()) {
            yearStr.append(cnum[c - '0']); 
        }
        String monthStr = toCNum(m) + "月";
        String dayStr = toCNum(d) + "日";

        return "西元" + yearStr + "年" + monthStr + dayStr;
    }
    } // DIY，若要用暴力法…..


public class MI2C_HWK8_412631383_04 {
     public static void main(String[] args) {
        MDate md = new MDate(1905, 10, 23); // 1905, 10, 12
        System.out.println(md); //印出: 西元一九○五年十月二十三日
    }
}
