/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *146 ex1
 * @author admin
 */
class Frac{
int up,down;
static int gcd(int a,int b){
 while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
}
static void set(Frac f1,int up,int down){
  f1.up=up;
  f1.down=down;
}
static void reduce(Frac f1 ) { 
     int gcd=gcd(f1.up,f1.down);
     f1.up=f1.up/gcd;
     f1.down=f1.down/gcd;
}
static void print( String header,Frac f1) {
    System.out.println(header+f1.up+"/"+f1.down);
}
}
public class MI1C_HWK10_412631383_02 {
    public static void main(String[] args) {
   Frac f1 = new Frac();
Frac.set(f1, 15, 30); 
Frac.reduce(f1) ; 
Frac.print("f1=",f1) ; // 印出 f1=1/2
    }
}
