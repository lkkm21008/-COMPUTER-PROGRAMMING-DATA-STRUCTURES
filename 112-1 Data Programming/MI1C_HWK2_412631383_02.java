
package homework;

import java.util.*;
public class MI1C_HWK2_412631383_02 {
    public static void main(String[] args) {
          Scanner cin = new Scanner(System.in); 
        System.out.print("Input your first name:");
     String fn=cin.next();
        System.out.print("Input your last name:");
             String ln=cin.next();
  double    ft,in,cm;
        System.out.print("Height(Feet Inches):");
        ft=cin.nextDouble();
        in=cin.nextDouble();
        cm=(ft*12+in)*2.54;
        System.out.println(ln+"," +fn+"   " +cm+"cm");


        
    }
  
    
}
