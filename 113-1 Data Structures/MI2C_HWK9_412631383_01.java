/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class MI2C_HWK9_412631383_01 {
     public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
       String varNameReg="^[a-zA-Z_$][a-zA-Z0-9_$]{0,7}$";
       System.out.println("Input:");
       String varName=cin.next();
       if(varName.matches(varNameReg)){
           System.out.println(varName+"is a vaild variable name.");
       }else{
           System.out.println("***"+varName+"is not a valid variable name.");
       }
       
       String phoneReg="^(02-)?\\d{8}(#\\d{4})?$";
         System.out.println("Input:");
       String phone=cin.next();
       if(phone.matches(phoneReg)){
         System.out.println(phone + " is a valid phone number.");
       }else{
         System.out.println("*** " + phone + " is not a valid phone number.");
       }
       
   String urlReg = "^([a-zA-Z0-9]+\\.){2,5}[a-zA-Z0-9]+\\.(de|jp)$";

        System.out.println("Input a URL to test:");
        String url = cin.next().trim(); // 去除可能的空白

        if (url.matches(urlReg)) {
            System.out.println(url + " is a valid URL.");
        } else {
            System.out.println("*** " + url + " is not a valid URL.");
        }

    }
}
//1. 撰寫三個規則式，分別可檢查以下樣式，產生正確的檢查結果。(請下載Regex_EX1.txt)
//(1) 變數名稱: 以英文字母, _ 或$開始，之後可使用英文字母，_或者數字來接續，變數總長度不可超過8個字元。
//(2) 電話號碼: 例如02-26215656#2645, (區碼):二碼或者不存在，(電話):8碼，(轉接):四碼或不存在
//(3) 合格網址: 網址中除了『.』之外，只能出現英、數字，又網址中的區段最多六個，最少三個。此外，此網址必須為德國或日本網址。