
package homework;

import java.util.*;
public class MI1C_HWK4_412631383_04 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String cmd; double r;
        System.out.print("CMD>");
        cmd=cin.next(); r=cin.nextDouble();
        if(cmd.equals ("cir") ){
            System.out.println("r="+r);
            System.out.println("circumference="+(2*3.14*r));
        }else if(cmd.equals("area")){
            System.out.println("r="+r);
            System.out.println("area="+(3.14*r*r));
        }else if(cmd.equals("vol")){
            System.out.println("r="+r);
            double x;
            x=3.14*r*r*r;
            System.out.printf("volume=%.3f\n",(4*x)/3);
        }else{
            System.out.println("unknow command");
        }
    }
}
