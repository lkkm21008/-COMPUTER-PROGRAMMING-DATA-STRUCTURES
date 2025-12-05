
package homework;
import java.util.*;
public class MI1C_HWK5_412631383_04 {
    public static void main(String[] args) {
         Scanner cin=new Scanner(System.in);
        System.out.println("[lb.ub]:");
             int lb=cin.nextInt();
        int ub=cin.nextInt();
        int total=0;
        System.out.print("sum=");
        for(int i =lb; i<=ub;i++){
            System.out.print(i);
            total=total+i;
            if(i<ub){
                System.out.print("+");
            }
        }
        System.out.println("="+total);
        
    }
}
