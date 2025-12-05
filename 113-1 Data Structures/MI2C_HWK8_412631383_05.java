/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK8_412631383_05 {
    public static void main(String[] args) {
         String s = "Peter,15,35,44,77\nMary,88,65,37,45\nPaul,45,63,85,89";
         String[] lines=s.split("\n");
         for(String line:lines){
         String[] data=line.split(",");
         String name=data[0];
         int[] scores=new int[4];
         for(int i=0;i<4;i++){
         scores[i]=Integer.parseInt(data[i+1]);
         }
         double average=(scores[0]+scores[1]+scores[2]+scores[3])/4.0;
        String scoreStr = String.join(" ", data[1], data[2], data[3], data[4]);
          System.out.printf("%s %s 平均分數: %.2f%n", name, scoreStr, average);
         }
    }
}
