/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Arrays;

class StudentInfo {
    String id, name;
    double[] avgScore; //  紀錄大學各學年的平均成績
    static int DEFAULT_SCORE = -1;

    void setIDName(int id, String name) { 
        // DIY
        this.id=Integer.toString(id);
        this.name=name;
    }
    void set(int id, String name, double[] score) { // DIY 
        setIDName(id, name); // this.setIDName(id,name)
        // 將score[]複製到avgScore[]，若長度不符，以score[]為準
        // 若score[]長度超過7，則取前7個元素
         if (score.length > 7) {
            avgScore = Arrays.copyOfRange(score, 0, 7);
        } else {
            avgScore = Arrays.copyOf(score, score.length);
        }
    }
    
    // getGrades(): 將各年平均分數對應至A-E，存於一字串陣列傳回
    // 80~: "A", 70-79: "B", 60-69:"C", 50-59:"D", 0-49: "E"
    String[] getGrades(){
        String[] grade=new String[avgScore.length];
       for(int i =0;i<this.avgScore.length;i++){
        if(avgScore[i]>=80){
          grade[i]="A";
        }else if(avgScore[i]>=70 && avgScore[i]<=79){
          grade[i]="B";
        }else if(avgScore[i]>=60 && avgScore[i]<=69){
          grade[i]="C";
        }else if(avgScore[i]>=50 && avgScore[i]<=59){
          grade[i]="D";
        }else{
         grade[i]="E";
        }
       
       }       
        return grade;
    }
    
    void display(String header) {
        // 印出各年成績, [ID] Name : [y1] score, [y2] score ….
      System.out.println(header + " [" + this.id + "] " + this.name + ": " + Arrays.toString(this.avgScore));
    }
}
//card1: (1001, "Mary", score, [75, 84, 63, 89, 55])
public class MI2C_HWK6_412631383_01{

    public static void main(String[] args) {
        StudentInfo card1 = new StudentInfo();
        double[] score = {75, 84, 63, 89, 55};
        card1.set(1001, "Mary", score);
        score[0]=score[1]=score[2]=score[3]=score[4]=-1 ;
        card1.display("card1:");
        
        StudentInfo card2 = new StudentInfo();
        card2.set(1002, "Peter", new double[]{85, 78, 88, 85});
        card2.display("<card2>");
        

        String[] gs = card1.getGrades(); // [B, A, C, A, D]
        System.out.println("Grades of Mary=" + Arrays.toString(gs));
    }
}
/* [程式輸出]
card1: (1001, "Mary", score, [75, 84, 63, 89, 55])
card2: (1002, "Peter", [85, 78, 88, 85]);
...
*/
