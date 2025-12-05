
package homework;

import java.util.*;
public class MI1C_HWK2_412631383_03 {
    public static void main(String[] args) {
          Scanner cin= new Scanner(System.in);
          int timeCode;
          System.out.print("Input timeCode:");
          timeCode=cin.nextInt();
          System.out.println("timeCode="+timeCode);
          int hh,mm,ss;
          hh=timeCode/10000;
          mm=(timeCode/100)%100;
          ss=(timeCode%100);
          System.out.printf("time=%02d:%02d:%02d\n", hh, mm, ss);
          
    }
}
