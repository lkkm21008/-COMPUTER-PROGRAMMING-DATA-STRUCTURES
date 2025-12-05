
package homework;

//修改範例程式，找出a[]中的最小值，並以如下格式印出。(假設a[8]=12為最小值)
import java.util.*;
public class MI1C_HWK9_412631383_05 {
    public static void main(String[] args) {
        int[] a=new int[50] ;
        Random r = new Random(111) ;
        for (int i = 0 ; i<a.length; i++){
            a[i] = r.nextInt(101) ;
        }
        int   min = a[0] ;
        for (int i = 1; i<a.length; i++) {    
              if (a[i]< min) { 
                   min = a[i];
                  System.out.println("[" + i + "] " + min+" (min)");
                 }
        }
   
    }
}
