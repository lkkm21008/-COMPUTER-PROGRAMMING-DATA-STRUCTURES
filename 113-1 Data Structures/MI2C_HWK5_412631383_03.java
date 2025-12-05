/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class Complex { 
    int a, b; // a+bi
    void set(int a, int b) { this.a = a;  this.b = b ;}
    // 在此處加入add() 
   Complex add(Complex c2){
    Complex result=new Complex();
    result.a=this.a+c2.a;
    result.b=this.b+c2.b;
    return result;
   }
   Complex mul(Complex c2){
    Complex result=new Complex();
    result.a=this.a+c2.a-this.b*c2.b; // 實部: ac - bd
    result.b=this.a+c2.b+this.b*c2.a; // 虛部: ad + bc
    return result;
   }
   
    public String toString() {
            return a+"+"+b+"i" ;
    }
}
public class MI2C_HWK5_412631383_03{
	public static void main(String[] args){
            Complex c1=new Complex(), c2=new Complex(), c3 ;
            c1.set(2, 3); 	c2.set(4, 6);
            System.out.println("c1="+c1);
            System.out.println("c2="+c2);
            System.out.println("---------------------");
		c3 = c1.add(c2) ; // c3 = 6+9i
		String s = c3.toString() ; // 令s= “6+9i” 
		System.out.println(s) ; 
		System.out.println(c3) ;  //自動呼叫c3.toString() ;
                Complex c4 = c1.mul(c2); 
                System.out.println("c4=c1*c2="+c4) ;
	}
}	
