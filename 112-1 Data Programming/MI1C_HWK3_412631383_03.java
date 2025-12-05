
package homework;

import java.util.*;
public class MI1C_HWK3_412631383_03 {
    public static void main(String[] args) {
      Scanner cin =new Scanner(System.in);
            System.out.print("input a, b, c=");
            double a=cin.nextDouble() ,b=cin.nextDouble() ,c=cin.nextDouble() ;
            double x=(b*b)-(4*a*c);
            if((b*b-4*a*c)>=0){
            double x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            double x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
                System.out.print("x1="+x1);
                System.out.println(",x2="+x2);
            }else{
               double  x3,x4;
                x3=(-b)/(2*a);
                x4=Math.sqrt(-x)/(2*a);
                   System.out.printf("x2="+x3+"+%.3fi\n",x4);
                        System.out.printf("x2="+x3+"-%.3fi\n",x4);
                
               
            }
    }
}
