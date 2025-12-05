/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2_list_and_implementation;


import java.util.* ;
class IntSet {
    ArrayList<Integer> data; 
    
    IntSet() { data = new ArrayList<>() ;}
    IntSet(Collection<Integer> c) { data = new ArrayList<>(c) ;}
    IntSet(IntSet s2) { data = new ArrayList<>(s2.data) ;}
    
    void add(Integer x) { data.add(x); }
    void add(Collection<Integer> c) { data.addAll(c) ;}
    void add(IntSet s2) { data.addAll(s2.data); }
    void clear() { data.clear(); }
    boolean contains(Integer x) { return data.contains(x); }
    boolean remove(Integer x) { return data.remove(x) ; }
    
   IntSet union(IntSet s2) {  // 聯集
    IntSet s3 = new IntSet(this);  // 先複製當前集合
    for (Integer num : s2.data) {
        s3.add(num);  // add() 本身應該已檢查重複
    }
    return s3;
}
  IntSet intersect(IntSet s2) {   // 交集
    IntSet s3 = new IntSet();  // 空集合
    for (Integer num : this.data) {
        if (s2.contains(num)) {
            s3.add(num);
        }
    }
    return s3; 
}
  IntSet excluOR(IntSet s2) {  // XOR（對稱差集）
    IntSet s3 = new IntSet();  // 應該初始化為空集合，而不是 `new IntSet(this)`
    
    // 遍歷 this (s1) 中的元素，加入不在 s2 內的元素
    for (Integer num : this.data) {
        if (!s2.contains(num)) {  
            s3.add(num);
        }
    }

    // 遍歷 s2 中的元素，加入不在 this (s1) 內的元素
    for (Integer num : s2.data) {
        if (!this.contains(num)) {  // 修正這裡的語法錯誤
            s3.add(num);
        }
    }
    return s3;
}   
    public String toString() { return data.toString(); }
}

public class MI2C_HWK1_412631383_02 {
    public static void main(String[] args) {
        IntSet s1 = new IntSet(List.of(1,2,3,4,5,6)) ;
        IntSet s2 = new IntSet(List.of(2,4,6,18,25)) ;        
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("------------------------------"); 

        IntSet s3 = s1.union(s2);
        System.out.println("s3="+s3);        
        IntSet s4 = s1.intersect(s2);
        System.out.println("s4="+s4);        
        IntSet s5 = s1.excluOR(s2);
        System.out.println("s5="+s5);
    }
}

