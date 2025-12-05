
package homework;
import java.util.*;
public class MI1C_HWK5_412631383_01 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
          System.out.println("computer againg(yes/no)?");
            String  choice=cin.next(); 
      // String choice="yes";
        while(choice.equalsIgnoreCase("yes")){
            System.out.println("input score:");
             int score=cin.nextInt();
             int total=0,avg = 1,cnt=0;
            while(score>0){
                   total += score;
               cnt++;
               avg=total/cnt;  
               System.out.println("input score:");
                score=cin.nextInt();
             }
                 System.out.println("total= "+total+" avg= "+avg);
        }
        }
    }

