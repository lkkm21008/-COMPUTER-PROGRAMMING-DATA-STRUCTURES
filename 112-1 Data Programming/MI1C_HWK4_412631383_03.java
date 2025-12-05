
package homework;
import java.util.*;
public class MI1C_HWK4_412631383_03 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("請輸入三個整數:");
        int a,b,c;
        a=cin.nextInt();
        b=cin.nextInt();
        c=cin.nextInt();
        if(a>b){
        if(b>c && a>c){
            System.out.println(a+" "+b+" "+c);
        }else if (b<c && a>c){
            System.out.println(a+" "+c+" "+b);
        }else if(c>b && c>a){
            System.out.println(c+" "+a+" "+b);
        }
        }if(b>a){
        if(b>c && a>c){
            System.out.println(b+" "+a+" "+c);
        }else if (b>c && c>a){
            System.out.println(b+" "+c+" "+a);
        }else if(c>b && c>a){
            System.out.println(c+" "+b+" "+a);
        }
        }
    }   
}
