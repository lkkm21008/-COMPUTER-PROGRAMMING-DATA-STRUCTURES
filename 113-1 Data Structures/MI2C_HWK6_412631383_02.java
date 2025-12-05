/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
/*
EX1: 請產生50位同學的成績資料卡，並用亂數設定其姓名與成績，方式如下: 
(a) name: NameXXX, XXX: 2位數的整數亂數[0,999]，如"Name128", "Name087", …
(b) score: 整數亂數[0,100]
*/
import java.util.*;
class ScoreCard {
    String name; int score;
void set(String name,int score){
 this.name=name; this.score=score;
}
void print(){
    System.out.println("name: "+this.name+", score"+this.score);
}
 void fillRandom(ScoreCard[] cs){
      Random  r=new Random(111);
        for(int i =0;i<cs.length;i++){
         cs[i]=new ScoreCard();
         
        int nameNum=r.nextInt(1000);
        String name=String.format("Name%03d", nameNum);
        
        int score=r.nextInt(101);
        cs[i].set(name,score);
        }
}
} 
public class MI2C_HWK6_412631383_02 {
    public static void main(String[] args) {
	 ScoreCard[] cs =  new ScoreCard[10] ;  
         ScoreCard scInstance=new ScoreCard();
         scInstance.fillRandom(cs);
        for (ScoreCard sc : cs) {
            sc.print(); 
        }
    }
}
