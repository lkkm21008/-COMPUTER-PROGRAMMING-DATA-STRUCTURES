package ch2_list_and_implementation;

import java.util.* ;
public class MI2C_HWK1_412631383_01 {
    public static void main(String[] args) {        
        //ArrayList<Integer> s1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6)) ;
        //ArrayList<Integer> s2 = new ArrayList<>(List.of(2, 4, 6, 18, 25)) ;
        List<Integer> s1 = List.of(1, 2, 3, 4, 5, 6); //不可改變內容之串列
        List<Integer> s2 = List.of(2, 4, 6, 18, 25);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("----------------------------------");
        
        // === 計算s1與s2的聯集，將結果存於ArrayList<Integer> s3中   
       List<Integer> s3=new ArrayList<>(s1);
       for(int num:s2){
        if(!s3.contains(num)){
         s3.add(num);
        }
       }
         System.out.println("s3="+s3);        
        // === 計算s1與s2的交集，將結果存於ArrayList<Integer> s4中  
        List<Integer> s4=new ArrayList<>();
        for(int num:s1){
         if(s2.contains(num)){
          s4.add(num);
         }
        }
         System.out.println("s4="+s4);        
        // === 計算s1與s2的XOR，將結果存於ArrayList<Integer> s5中        

       List<Integer> s5 = new ArrayList<>();
for (int num : s1) {
    if (!s2.contains(num)) {
        s5.add(num);
    }
}
for (int num : s2) {
    if (!s1.contains(num)) { // 這裡應該是 !s1.contains(num)
        s5.add(num);
    }
}
System.out.println("s5=" + s5);
    }
}
/*　[程式輸出]
s1=[1, 2, 3, 4, 5, 6]
s2=[2, 4, 6, 18, 25]
------------------------------
s3=[1, 2, 3, 4, 5, 6, 18, 25]
s4=[2, 4, 6]
s5=[1, 3, 5, 18, 25]
*/

