
package homework;

import java.util.*;
public class MI1C_HWK4_412631383_06 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("請輸入五位同學的分數:");
        int a= cin.nextInt(),b= cin.nextInt(),c= cin.nextInt(),d= cin.nextInt(),e= cin.nextInt();
        double avg,sum;
        sum=a+b+c+d+e;
        avg=sum/5;
        System.out.println("total="+sum+","+"avg="+avg);
        
    }
   
}
