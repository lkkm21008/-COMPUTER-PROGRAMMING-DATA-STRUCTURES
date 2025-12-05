package homework;

import java.util.*;
public class MI1C_HWK2_412631383_05 {
    public static void main(String[] args) {
                  Scanner cin= new Scanner(System.in);
        System.out.print("Input length of three edges:");
        double a,b,c,area,s;
        a=cin.nextDouble();
        b=cin.nextDouble();
        c=cin.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("length of three edges="+a+" "+b+" "+c);
        System.out.println("Area="+area);
    }
}
