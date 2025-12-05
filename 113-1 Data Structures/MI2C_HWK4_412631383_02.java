/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class Frac {
    int up, down; // 表示分數: up/down
    static int gcd(int a, int b) { // 用來約分
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a; // DIY 
    }
    // DIY here, 
    // 完成 set(), reduce(), print() 函數
    static void set(Frac f,int up,int down){
      f.up=up; f.down=down;
    }
    void reduce(){
    int gcd=gcd(this.up,this.down);
    this.up/=gcd;
    this.down/=gcd;
    }
    static void print(String header ,Frac f){
        if(f.down==1){
            System.out.println(header+f.up);
        }else{
        System.out.println(header+f.up+"/"+f.down);
        }
    }
    // 完成add(f2)函數
    Frac add(Frac f2){
     Frac result=new Frac();
     result.up=this.up*f2.down+f2.up*this.down;
     result.down=this.down*f2.down;
     result.reduce();
     return result;
    }
}

public class MI2C_HWK4_412631383_02 {
    public static void main(String[] args) {
        Frac f1 = new Frac(), f2=new Frac();
        Frac.set(f1, 15, 30);
        f1.reduce();
        Frac.print("f1=", f1); // 印出f1=1/2
        Frac.set(f2, 123, 82); // 123/82
        f2.reduce();
        Frac.print("f2=", f2); // 印出f2=3/2

        Frac f3 = f1.add(f2) ; // f3 = f1+f2
        Frac.print("f3=f1+f2=", f3); // 印出f2=f1+f2=2
    }
}

