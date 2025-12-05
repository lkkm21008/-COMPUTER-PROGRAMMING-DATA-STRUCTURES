package hwk;

public class MI1C_HWK3_412631383_05 {

    public static void main(String[] args) {
        int up = 54, down = 84; 	// 表示分數 54/84
        System.out.println("gcd of " + up + " and " + down + " is " + gcd(up, down));
        reduceAndPrint(up, down);
    }
    public static int gcd(int x, int y) {    
        int a,b,cf=0;
    for(int i =1;i<x;i++){
     if(x%i==0 && y%i==0){
       cf=i;
     } 
    }  
    return cf;
    }
    public static void reduceAndPrint(int u, int d) { 
        // void 表示此函數無須回傳任何值
        // DIY here ... 需呼叫gcd()函數，印出分數u/d約分後的結果
        int up =u/gcd(u,d);
        int down=d/gcd(u,d);
        System.out.println(up+"/"+down);
    }
}
