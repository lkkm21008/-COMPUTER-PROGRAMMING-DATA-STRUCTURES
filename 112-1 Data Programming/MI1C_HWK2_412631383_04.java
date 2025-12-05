package homework;

import java.util.*;
public class MI1C_HWK2_412631383_04 {
    public static void main(String[] args) {
  System.out.println("[solve]aX**2+bX+c=0");
         Scanner cin= new Scanner(System.in);
          double a, b, c,d,x1,x2;
         System.out.print("Input a,b,c:");
         a=cin.nextDouble();
         b=cin.nextDouble();
         c=cin.nextDouble();
         d=Math.sqrt((Math.pow(b, 2)-(4*a*c)));
         x1=-(b-d)/(2*a);
         x2=-(b+d)/(2*a);
        System.out.println("x1="+x1);
        System.out.println("x2="+x2);
     
        
    }
}
