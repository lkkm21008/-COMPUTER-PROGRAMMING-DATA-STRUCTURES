/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK8_412631383_01 {
      public static String[] legalExt = {"pdf", "doc", "docx", "txt"};
    public static void main(String[] args) {
        String[] fNames = {"source.pdf", "jpg.jpg", "docx", "word.docx", "memo.txt", "memo_txt"};
        for (String fname:fNames) {
            // 印出各檔名是否合法 ?
          System.out.println(fname + " is valid: " + legalExtension(fname));
        }
    }
    public static boolean legalExtension(String filename) {
        // 上傳檔案前，根據legalExt[]判別filename是否為合法的檔案名稱
        // 如果是，回傳true，否則回傳false
       if(filename==null || filename.isEmpty()){
                    return false;      
       }
       
       for(String ext:legalExt){
        if(filename.endsWith("."+ext)){
        return true;
        }
       }
           return false;
    }
}
