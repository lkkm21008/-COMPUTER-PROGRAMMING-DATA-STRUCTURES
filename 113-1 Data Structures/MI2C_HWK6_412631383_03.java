/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

class Point {
    int x, y;

    void set(int a, int b) {
        this.x = a;   this.y = b;
    }
    double dist(Point p2) { //計算本物件(this)與p2的距離
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class Polygon {
    Point[] ps; //記錄多邊形的頂點座標

    void init(int[] x, int[] y) { //利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        // DIY, deep copy 
      ps=new Point[x.length];
      for(int i=0;i<x.length;i++){
       ps[i]=new Point();
       ps[i].set(x[i],y[i]);
      }
    }
    double circumference() {  // DIY: 計算此多邊形週長
    double perimeter=0.0;
    
    for(int i =0;i<ps.length;i++){
    Point current=ps[i];
    Point next=ps[(i+1)%ps.length];
    perimeter+=current.dist(next);
    }
        return perimeter; // 自行修改
    }
    double area() { // DIY: 計算此多邊形面積	
        double sum=0.0;
        int n=ps.length;
        
        for(int i =0;i<n;i++){
        int x1=ps[i].x;
        int y1=ps[i].y;
        int x2=ps[(i+1)%n].x;
        int y2=ps[(i+1)%n].y;
        
        sum+=(x1*y2-x2*y1);
        }
        return Math.abs(sum)/2.0; // 自行修改
    }
    void display(String header) { // DIY: 印出多邊形header:(x0,y0)(x1,y1)…
        // DIY
             System.out.print(header + ": ");
        for (Point p : ps) {
            System.out.print(p + " ");  
        }
        System.out.println();
    }       
    public String toString() {
        // 回傳 "(x0,y0)(x1,y1)…" 字串
         String result = "";
        for (Point p : ps) {
            result += p.toString();  // 直接拼接字符串
        }
        return result;
    }
    }

public class MI2C_HWK6_412631383_03 {

    public static void main(String[] args) {
        Polygon pg = new Polygon();
        int[] x = {2, 5, 7, 6, 1};
        int[] y = {1, 1, 4, 5, 3};
        pg.init(x, y); // 利用(x[0],y[0]),(x[1],y[1])… 設定頂點
        pg.display("pg="); // pg=(2,1)(5,1)(7,4)(6,5)(1,3)
        System.out.println("pg="+pg);
        System.out.println("------------------------");
        double border = pg.circumference();
        System.out.println("border of pg=" + border);
        System.out.println("area of pg =" + pg.area());
    }
}
