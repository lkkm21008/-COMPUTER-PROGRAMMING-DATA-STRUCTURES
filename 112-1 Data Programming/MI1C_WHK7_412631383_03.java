
package homework;
import java.util.*;
public class MI1C_WHK7_412631383_03 {
    public static void main(String[] args) {
       Scanner cin=new Scanner(System.in);
        System.out.print("TEL:");
        int number=cin.nextInt();
       int cmd=number/10000000%10;
       int cmd2=number/1000000%10;
       
       switch(cmd){
           case 1:{
           if(cmd2==0 || cmd2==1 || cmd2==2 || cmd2==9){
               System.out.println("電信業者: 中華電信"); 
           }else if(cmd2==8 ){
               System.out.println("電信業者: 台灣大哥大");
           }else if(cmd2==6 || cmd2==7 ){
               System.out.println("電信業者: 遠傳電信");
           }
           break;
            }
             case 2:{
           if( cmd2==1 || cmd2==8 ){
               System.out.println("電信業者: 中華電信"); 
           }else if(cmd2==0 || cmd2==2 ){
               System.out.println("電信業者: 台灣大哥大");
           }else if(cmd2==6){
               System.out.println("電信業者: 遠傳電信");
           }
           break;
            }
               case 3:{
           if(cmd2==3 || cmd2==4 || cmd2==2 || cmd2==7){
               System.out.println("電信業者: 中華電信"); 
           }else if(cmd2==5 || cmd2==9 ){
               System.out.println("電信業者: 台灣大哥大");
           }else if(cmd2==0 || cmd2==1 ||cmd2==6 ){
               System.out.println("電信業者: 遠傳電信");
           }
           break;
            }
                 case 5:{
              if(cmd2==8 || cmd2==3 ){
               System.out.println("電信業者: 台灣大哥大");
           }else if(cmd2==5){
               System.out.println("電信業者: 遠傳電信");
           }
           break;
            }
             case 6:{
           if(cmd2==3 ){
               System.out.println("電信業者: 中華電信"); 
           }
           break;
            }
               case 7:{
           if( cmd2==2 ){
               System.out.println("電信業者: 中華電信"); 
           }else if(cmd2==0 ){
               System.out.println("電信業者: 台灣大哥大");
           }
           break;
            }
       

       }
    }
}

