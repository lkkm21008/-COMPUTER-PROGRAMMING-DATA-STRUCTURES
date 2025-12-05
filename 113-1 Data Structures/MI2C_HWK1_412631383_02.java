/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.Random;
public class MI2C_HWK1_412631383_02 {
    public static void main(String[] args) {
          System.out.println("---- test isPrime(n) ---- ");
System.out.print("primeList[2,100]=");
for (int i = 0; i <= 100; i++) {
    if (isPrime(i)) System.out.print(i + " ");
}
System.out.println("");

System.out.println("---- test mutualPrime(a,b) ---- ");
Random r = new Random(111);
for (int i = 0; i < 5; i++) {
    int a = r.nextInt(200), b = r.nextInt(200);
    boolean mp = mutualPrime(a, b);
    System.out.printf("Are (%d,%d) mutually prime? %b\n", a, b, mp);
}
    }
    public static boolean isPrime(int a){
    if(a<=1){
     return false;
    }
    
    for(int i=2;i<=a/2;i++){
     if(a%i==0){
      return false;
     } 
    }
      return true;
    }
    public static boolean mutualPrime(int a,int b){
     while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;
    }
    return a==1;
    }
}
