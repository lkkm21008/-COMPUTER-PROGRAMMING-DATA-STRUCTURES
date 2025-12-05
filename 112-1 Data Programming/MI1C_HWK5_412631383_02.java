
package homework;

import java.util.*;
public class MI1C_HWK5_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner (System.in);
        System.out.println("input x:");
        double x=cin.nextDouble();
        while(x !=0){
          double answer=Math.sqrt(x);
          if(x>0){
                System.out.println("sqrt("+x+")="+answer);
          }else{
           double a;
          a=Math.sqrt(x*-1);
              System.out.println("sqrt("+x+")="+a+"i");
          }
              System.out.println("input x:");  
               x=cin.nextDouble();
        }
    }
}
