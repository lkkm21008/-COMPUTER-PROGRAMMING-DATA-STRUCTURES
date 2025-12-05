package hwk;
import java.util.*;
public class MI1C_HWK3_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("input n,k:");
        int n = cin.nextInt();int k = cin.nextInt();
        int up = factorial(n)/factorial(n-k);
        int down = factorial(k);
        System.out.printf("Cnk(%d,%d)=%d/%d=%d\n", n, k, up,down,Cnk(n, k));
    }
    public static int Cnk(int n, int k) {
        // ans = n!/(k! *(n-k)!)
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    public static int factorial(int x) {
        int rlt = 1;
        for (int i = 2; i <= x; i++) {
            rlt *= i;
        }
        return rlt;
    }
}
