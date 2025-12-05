
package homework;

import java.util.*;
public class MI1C_HWK2_412631383_01 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        double up,down,hight;
        System.out.print("Input lengths of the parallel sides: ");
        up=cin.nextDouble();
        down=cin.nextDouble();
        System.out.print("Input height:");
                hight=cin.nextDouble();
                double area=(up+down)*hight/2;
                 System.out.println("engths of the parallel sides="+up+","+down);
                System.out.println("area of the trapezoid="+area);

        
    }
}
