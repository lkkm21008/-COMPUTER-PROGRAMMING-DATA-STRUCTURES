
package homework;
//本利和=本金*(1+年利率)的n次 n=期數 //a=本金 r=年利率 n=期數 //(T-A)/p
//(本金, 年利率, 期數) = 10_00000.07 2 年利息收入= NT$ 7,245
import java.util.*;
public class MI1C_HWK5_412631383_03 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        String choice="y";
       while (choice.equalsIgnoreCase("y")){
        System.out.println("(本金, 年利率, 期數) =");
     double a=cin.nextDouble();double r=cin.nextDouble();
        double n = cin.nextDouble();
        double T;
        T=a*Math.pow((1+r), n);
        T=(T-a)/n;     
    System.out.printf("年利息收入=NT$%,3f\n",T);
           System.out.println("continue? (y/n)");
           choice=cin.next();
       }
    }
}
