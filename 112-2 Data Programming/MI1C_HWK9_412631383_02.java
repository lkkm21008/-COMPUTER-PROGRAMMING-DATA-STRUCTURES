/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
//，令f1=18/12, f2=4/30, 再令f3=f1+f2
class Frac{
   int up,down;
 }
public class MI1C_HWK9_412631383_02 {
    public static void main(String[] args) {
        Frac f1=new Frac();
        Frac f2=new Frac();
        f1.up=18; f1.down=12;
        f2.up=4; f2.down=30;
        Frac f3=new Frac();
        f3.up=(f1.up*f2.down)+(f2.up*f1.down);
        f3.down=f1.down*f2.down;
        int common=gcd(f3.up,f3.down);
        f3.up=f3.up/common;
        f3.down=f3.down/common;
        System.out.println("f3="+f3.up+"/"+f3.down);
    }
   public static int gcd (int a ,int b){
   while (b!=0){
   int temp =b;
   b=a%b;
   a=temp;
   }
   return a;
   }
}
