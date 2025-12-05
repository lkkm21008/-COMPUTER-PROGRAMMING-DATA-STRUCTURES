
package homework;
//電影票計價，規則如下a全票:260 b軍警票:220c半票:190  早場:打九折(軍警票不再折扣)午、晚場:不折扣
import java.util.*;
public class MI1C_WHK7_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
       double price =0;
       String choice="y";
       while(choice.equals("y")){
            System.out.print("開演時間:");
        int time=cin.nextInt();
        System.out.print("票種: (1)全票(2)軍警(3)半票=> ");
        int cmd=cin.nextInt(); 
        switch(cmd){
            case 1:
                if(time == 1030){
                price=260*0.9;
                }else if (time == 1530){
                 price=260;                
                }
            break;
            case 2:
               price=220;         
            break;
            case 3:
                 if(time == 1030){
                price=190*0.9;
                }else if (time == 1530){
                 price=190;
              break;
                }
            default:
            break;     
        }
           System.out.printf("票價:%.0f元\n",price);
           System.out.println("another ticket (y/n)?");
           choice=cin.next();
    }

}
}