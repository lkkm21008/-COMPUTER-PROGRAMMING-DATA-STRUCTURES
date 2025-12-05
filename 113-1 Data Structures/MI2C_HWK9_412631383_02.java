/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK9_412631383_02 {
     public static void main(String[] args) {
        String s = "今年的產生達到NT$5000萬元，每位員工最少可分到新台幣50萬元的紅利，創下歷史新高。"
                + "預計明年春，寶元企業將會在歐洲設立新總部，設置所需成本粗估為US$120,000,000。為運作緣故，"
                + "公司將在2025年雇用約150名當地員工，並依當地薪資水準給薪...";

        String currencyRegex = "(?:NT\\$|新台幣|US\\$)?\\d{1,3}(?:,\\d{3})*(?:萬|元|美元)?";
     
        String replaced = s.replaceAll(currencyRegex, "@@@");
  
        System.out.println(replaced);
    }
}
/*
2. 請使用replaceAll()函數配合規則式，將以下字串s中的金額部以"@@@"來取代。
String s = "今年的產生達到NT$5000萬元，每位員工最少可分到新台幣50萬元的紅利，創下歷史新高。
預計明年春，寶元企業將會在歐洲設立新總部，設置所需成本粗估為US$120,000,000。為運作緣故，
公司將在2025年雇用約150名當地員工，並依當地薪資水準給薪..."
*/