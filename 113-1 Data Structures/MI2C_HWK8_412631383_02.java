/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class Pattern {
    public static int occurrence(String seq, String pat) {
               if(seq==null || pat==null || seq.isEmpty() || pat.isEmpty()){
        return 0;
        }
       int cnt=0;
       int index=seq.indexOf(pat,0);
       
       while(index != -1){
       cnt++;
       index=seq.indexOf(pat,index+1);
       }
       return cnt;
    }
}
public class MI2C_HWK8_412631383_02 {
      public static void main(String[] args) {
        String sequence = "AABBABABABBBBAB", pattern = "BAB";
        // 印出BAB在sequence出現的次數 
        int times = Pattern.occurrence(sequence, pattern);
        System.out.println("times=" + times);
    }
}
