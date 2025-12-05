/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.*;

class Member {
    // 只有10名VIP,此陣列紀錄vip member
    static Member[] VIPList=new Member[10]; 
    static Member defaultMem = new Member(-1, "XXX") ;
    int id; String name; 

    Member() { 
        for (int i = 0; i<VIPList.length;i++) 
            VIPList[i]=defaultMem; 
        this.id = -1; this.name="XXX" ;
    }
    Member(int id, String n) {
        this.name = n; this.id = id;
    }
    public String toString() { 
        return "("+id+","+name+")";
    }
}
public class MI2C_HWK7_412631383_01 {
    public static void main(String[] args) {
        // 產生100個會員，(1000,Name_0), (1001,Name_1), ...
        Member[] ms = new Member[100];
        for (int i = 0; i < ms.length; i++) {
            ms[i] = new Member(1000 + i, "Name_" + i);
        }
        Random r = new Random(444);
        boolean[] isVIP=new boolean[100];
        int vipCount=0;
        while(vipCount <10){
        int index=r.nextInt(101);
        if(!isVIP[index]){
         Member.VIPList[vipCount]=ms[index];
         isVIP[index]=true;
         vipCount++;
        }
        }
           System.out.println("中獎名單:");
        for (Member vip : Member.VIPList) {
            System.out.println(vip);
        }
        // 模擬電腦抽獎，隨機從ms[]中挑選10個VIP，將其記錄在VIPList[]中
        // 印出中獎名單-這十位VIP (VIP不可重複)

    }
}