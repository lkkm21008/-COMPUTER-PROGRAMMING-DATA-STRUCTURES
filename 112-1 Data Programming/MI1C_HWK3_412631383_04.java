
package homework;
import java.util.*;
public class MI1C_HWK3_412631383_04 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("請輸入三角形三邊:");
        double a,b,area,c,s;
         a=cin.nextDouble();
         b=cin.nextDouble();
         c=cin.nextDouble();
         
        if(a+b>c && a+c>b && b+c>a){
           s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("(a,b,c)="+a+" "+b+" "+c);
            System.out.print("合法三角形");
            System.out.printf(",area=%.2f\n",area);
        }else{
             System.out.println("(a,b,c)"+a+" "+b+" "+c);
            System.out.println("不合法三角形");
        }
    }
}
