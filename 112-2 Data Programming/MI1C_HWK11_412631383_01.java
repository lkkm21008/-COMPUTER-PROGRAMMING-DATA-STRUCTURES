/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
class Rect {
    double w, h;

    void set(double a, double b) {
        this.w = a;    this.h = b;
    }
    double calArea(){
    return this.w*this.h;
    }
    void draw(String sym){
    
    }
    boolean larger(Rect r2){
      return this.calArea()>r2.calArea();
    }
    // DIY here, calArea(), draw(), larger()
}
public class MI1C_HWK11_412631383_01 {
      public static void main(String[] args) {
        /*
        Rect r1 = new Rect();
        r1.set(5, 3); // w=5, h=3 
        double a = r1.calArea();
        System.out.println("area=" + a);

        r1.draw("*"); // 用星號畫出r1
        Rect r2 = new Rect();
        r2.set(4.5, 3.5);
        boolean b = r1.larger(r2); //比較r1的面積是否筆r2大
        if (b) {
            System.out.println("r1 is larger than r2");
        } else {
            System.out.println("r1 is not larger than r2");
        }
        */
    }
}
