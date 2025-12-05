/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK1_412631383_01 {
      public static void main(String[] args) {        
          int frlt = factorial(12) ;
           System.out.println("factorial(12)="+frlt);
            double prlt1 = power(3.3, 5), prlt2=power(2.5,0) ;
        System.out.println("power(3.3, 5)="+prlt1);
        System.out.println("power(2.5, 0)="+prlt2);
        
        System.out.println("---- test TriangleArea(a,b,c) ----");
        double area1 = Area(18, 20, 9), area2 = Area(7, 13, 6) ;
        System.out.println("triangleArea(18, 20, 9)="+area1);
        System.out.println("triangleArea(7, 13, 6)="+area2);

      } 
      public static int factorial(int a){
          int ans=1;
      for(int i =1;i<=a;i++){
      ans*=i;
      }
      return ans;
      }
      public static double power(double a,double b){
      double ans=1;
      for(int i=0;i<b;i++){
      ans *= a;
      }
      return ans;
      }
      public static double Area(int a ,int b,int c){
      if(a+b <= c || a+c <=b || b+c <= a){
      return -1;
      }
      double s=(a+b+c)/2.0;
      double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      return area;
      }
}
