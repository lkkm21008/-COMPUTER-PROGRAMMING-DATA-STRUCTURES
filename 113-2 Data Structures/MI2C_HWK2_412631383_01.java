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
class ArrayListX<T> { …} // 同前，勿重複撰寫
*/

import java.util.*;
class Point3D {
    int x,y,z ;
    Point3D(int a, int b, int c) {x =a; y=b; z= c ;}
    // toString(): DIY 回傳(x,y,z)
    double dist(Point3D p){
     return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
    }
    public String toString(){
     return "("+x+","+y+","+z+")";
    }
}
public class MI2C_HWK2_412631383_01 {
    public static void main(String[] args) {
        // 宣告一個可以儲存Point3D物件的List容器pList
	List<Point3D> pList=new ArrayList<>();
        Random r=new Random(111);
        // 用亂數產生60座標(x,y,z)，建立60個Point3D物件，依序放入List中
         // x,y,z介於[0,200]，亂數種子: 111 
        for(int i=0;i<60;i++){
           int x=r.nextInt(201);
           int y=r.nextInt(201);
           int z=r.nextInt(201);
           pList.add(new Point3D(x,y,z));
      }

        // 印出前10點座標
        System.out.println("前10個點的座標:");
        for(int i=0;i<10;i++){
            System.out.println(pList.get(i));
        }
        // 最後印出總飛行距離
        double totalFlight=0;
        for(int i=1;i<pList.size();i++){
         totalFlight +=pList.get(i-1).dist(pList.get(i));
        }
        //總直線距離
        double totalStraight=pList.get(0).dist(pList.get(pList.size()-1));
        
         System.out.printf("總飛行距離: %.2f%n", totalFlight);
         System.out.printf("總直線距離: %.2f%n", totalStraight);  
    }
}
