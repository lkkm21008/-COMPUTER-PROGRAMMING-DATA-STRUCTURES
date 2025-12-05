/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */

class Rect {
	double w, h ;
	void set(double a, double b) {
		this.w=a;  this.h=b ;
	} 
	// DIY here, calArea(), draw(), larger()
        double calArea(){
         return this.w*this.h;
        }
        void draw(String symbol){
        int width=(int)Math.round(this.w);
        int heigth=(int)Math.round(this.h);
        for(int i=0;i<width;i++){
        for(int j=0;j<heigth;j++){
            System.out.print(symbol);
        }
            System.out.println("");
        }
        }
        boolean larger(Rect r2){
        return this.calArea() > r2.calArea();
        }
}
public class MI2C_HWK5_412631383_01{
	public static void main(String[] args) {
		Rect r1 = new Rect() ;
		r1.set(5.4, 3.8) ; // w=5, h=4 
		double a = r1.calArea() ;
		System.out.println("area="+a) ; 

		r1.draw("*") ; // 用星號畫出r1, 四捨五入
                
		Rect r2 = new Rect() ; 	r2.set(4.5, 3.5) ;
		boolean b = r1.larger(r2); //比較r1的面積是否筆r2大
		if (b) System.out.println("r1 is larger than r2") ;
		else System.out.println("r1 is not larger than r2") ;
	}
}