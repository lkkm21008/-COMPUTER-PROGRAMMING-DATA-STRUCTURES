
package homework;

import java.util.*;
public class MI1C_WHK7_412631383_04 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);  
        while (true) {
            System.out.print("輸入算式 (或輸入 'exit' 退出): ");

            // Check if the user wants to exit
            if (cin.hasNext("exit")) {
                System.out.println("bye!");
                break;
            }
        double x1=cin.nextDouble();
        String expr=cin.next();
        double x2=cin.nextDouble();
        cin.next();
        double ans = 0;
       while( ans >=0 || ans<=0){
        switch(expr){
            case "+":
                ans=x1+x2;
            break;
            case "-":
                ans=x1-x2;
            break;
            case "*":
                ans=x1*x2;
            break;
            case "/":
                ans=x1/x2;
           break;
            case "**":
                ans=Math.pow(x1, x2);
            break;    
            default :
                 System.out.println("wrong input");
                 continue; 
           
        }
         System.out.println(ans);
         System.out.print("輸入算式 (或輸入 'exit' 退出): ");
                if (cin.hasNext("exit")) {
                    System.out.println("bye!");
                    System.exit(0);
                }
                x1 = cin.nextDouble();
                expr = cin.next();
                x2 = cin.nextDouble();
                cin.nextLine();  
        }
      
}
}
}