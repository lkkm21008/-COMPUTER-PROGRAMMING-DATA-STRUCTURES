
package homework;

//撰寫一程式，在陣列中搜尋特定值，最後印出查詢結果
import java.util.*;
public class MI1C_HWK9_412631383_04 {
    public static void main(String[] args) {
        int studNo = 100 ;
        int[] score=new int[studNo] ;
        Random r = new Random(111) ;
        for (int i = 0 ; i<score.length; i++){
        score[i] = r.nextInt(101);
        }
        Scanner cin =new Scanner(System.in);
        System.out.print("Input a score: ") ;
        int key=cin.nextInt() ; 
          int cnt=0;
          for(int i =0;i<score.length;i++){ 
             if(score[i]==key){
                System.out.println("[" + i + "] " + key);
                cnt++;
             }
          }
          System.out.println("#no=" + cnt);
    }
}
