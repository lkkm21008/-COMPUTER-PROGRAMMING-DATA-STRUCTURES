
package homework;
import java.util.*;
public class MI1C_HWK5_412631383_05 {
    public static void main(String[] args) {
         Scanner cin=new Scanner(System.in);
        System.out.println("[lb.ub,m]:");
             int lb=cin.nextInt();
             int ub=cin.nextInt();
             int m=cin.nextInt();
             int sum=0;
             System.out.print("sum of events=");
             for(int i =lb;i<=ub;i++){
             if(i%m==0){
             sum +=i;
                 System.out.print(i+"+");
             }
   
    }
               System.out.println("="+sum);
}
}
