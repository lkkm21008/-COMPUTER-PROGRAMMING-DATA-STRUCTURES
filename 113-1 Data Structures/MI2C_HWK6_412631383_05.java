/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class Color {
    int r, g, b;
    Color() {
        this.r = this.b = this.g = 0;
    }
    Color(int x, int y, int z) {
        this.r = x;  this.g = y;  this.b = z;
    }

    public String toString() {
        return "(" + r + "," + g + "," + b + ")";
    }
}

class ColorPoint {
    int x, y;
    Color c;
    // DIY here, 根據main()中的需求，加入適當的建構式
    ColorPoint(int x,int y,int c1,int c2,int c3){
    this.x=x;this.y=y;
    this.c=new Color(c1,c2,c3);
    }
    ColorPoint(){ 
     this.x=this.y=0; 
    this.c=new Color();
    }
    ColorPoint(ColorPoint p2){
        this.x = p2.x;
        this.y = p2.y;
        this.c = new Color(p2.c.r, p2.c.g, p2.c.b); 
    }
    public String toString() {
        return "(" + x + "," + y + "), Color=" + c;
    }
}

public class MI2C_HWK6_412631383_05 {
    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(); // 座標:(0,0) 黑色(0,0,0)
        System.out.println("[1="+p1);
        ColorPoint p2 = new ColorPoint(5, 3, 255, 0, 0);
        System.out.println("p2="+p2);
        ColorPoint p3 = new ColorPoint(p2);
        System.out.println(p1 + "\t" + p2 + "\t" + p3);
    }
}