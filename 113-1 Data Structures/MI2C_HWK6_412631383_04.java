/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;
class Frac {
    int up, down; 
    // DIY here 
    // 加入constructors
    Frac(){
    this.down=-1;
    this.up=-1; 
    }
    Frac(int a,int b){ 
        this.up=a; this.down=b;}
    Frac(Frac f2){
     this.up=f2.up; this.down=f2.down;
    }
    void set(int a, int b){
     this.up=a; this.down=b;
    }
    void set(Frac f2){
     this.up=f2.up; this.down=f2.down;
    }
    public String toString( ){
       return this.up+"/"+this.down;
    }
}
public class MI2C_HWK6_412631383_04 {
    public static void main(String[] args) {
        // f1:3/5, f2:3/5, f3:17/8
        Frac  f =new Frac();    
        f.set(3,5);
        Frac f1=new Frac(5,3);
        Frac f2=new Frac(f1);
        System.out.println("f1="+f1+",f2="+f2);

//        Frac f2=new Frac();
//        f2.set(f1.up,f1.down);
        // Frac f1 = new Frac(3, 5), f2 = new Frac(f1), f3 = new Frac(2.125);
        // System.out.println("f1=" + f1 + ", f2=" + f2 + ", f3=" + f3);
        // Frac f4 = new Frac();
        // System.out.println("f4=" + f4); // f4=0/1
    }
}
