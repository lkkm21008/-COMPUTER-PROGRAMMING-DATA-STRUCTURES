
package homework;
import java.util.*;
public class MI1C_HWK3_412631383_01 {
    public static void main(String[] args) {
          Scanner cin=new Scanner(System.in);
        System.out.print("income:");
         double income=cin.nextDouble();
         double tax=0;
             if(income<24_0000){
            tax=0;
              }else{
                 if (income<100_0000){
                 tax=income*0.06;
                         }else{
                 tax=income*0.13;
                 }

             }  
             
             System.out.println("tax="+tax);
    }
   
}
