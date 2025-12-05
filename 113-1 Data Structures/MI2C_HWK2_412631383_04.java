/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK2_412631383_04 {
        public static void main(String[] args) {
        printLCM(98, 28, 84); // 印出3個數的lcm,不用回傳結果

        int[] counts = {3, 2, 6, 4, 3, 5, 1};
        char[] symbol = {'+', '-', '@'};
        printSymbol(counts, symbol); //印出+++--@@@@@@++++---@@@@@+
    }
    public static void printLCM(int a, int b, int c) {
        // DIY here
        int lcmAB=lcm(a,b);
        int lcmABC=lcm(lcmAB,c);
        System.out.println("LCM of " + a + ", " + b + ", " + c + " is: " + lcmABC);
    }
    public static int lcm(int a,int b){
    return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
    while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;
    }
    return a;
    }
    public static void printSymbol(int[] counts, char[] symbols) {
        // DIY here
          int symbolIndex = 0; 

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                System.out.print(symbols[symbolIndex]); 
            }
            symbolIndex++; 
            if (symbolIndex >= symbols.length) {
                symbolIndex = 0; 
            }
        }
        System.out.println(""); 
         }
}
