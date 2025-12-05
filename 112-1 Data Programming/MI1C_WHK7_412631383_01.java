
package homework;
//假設分數(score)與等第(grade)對應表如下，撰寫一程式接受分數輸入後，印出其等第0~19(E), 20~39(D), 40~59(C), 60~79(B), 80~99(A), 100(A+)
import java.util.*;
public class MI1C_WHK7_412631383_01 {
    public static void main(String[] args) {
        Scanner cin=new Scanner (System.in);
        System.out.print("input score:");
        int score=cin.nextInt();
        score=score/20;
        switch(score){
            case 0:
                System.out.println("E");
                break;
            case 1:
                System.out.println("D");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("B");
            case 4:
                System.out.println("A");
                break;
            case 5:
                System.out.println("A+");
                break;
            default:
                 System.out.println("wrong input");
        }
    }
   
}
