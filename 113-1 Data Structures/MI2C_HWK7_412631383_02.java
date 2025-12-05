/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;



class Circle { 
    double x,y,r; 
    Circle(double x, double y, double r) {
        this.x=x; this.y=y; this.r=r;
    }
}		
class Rect { 
    double x,y,w,h; 
    Rect(double x, double y, double w, double h) {
        this.x=x; this.y=y; this.w=w; this.h=h;
    }
}
class Plotter { // 繪圖工具程式
    // 記錄0-359度的sin,cos值, sinTable[0] -> sin(0。)
    // 使用Math.sin(double rad) 弧度(180<->pi)
       // 記錄0-359度的sin,cos值
    static final double[] sinTable = new double[360]; 
    static final double[] cosTable = new double[360];

    static {
        for (int i = 0; i < 360; i++) {
            sinTable[i] = Math.sin(i * Math.PI / 180);
            cosTable[i] = Math.cos(i * Math.PI / 180);
        }
    }
    // DIY: 靜態初始化區塊, sinTable[i] = Math.sin(i*Math.PI/180) ;

			

    static void paint(Circle c, char[][] board) { // 在board[][]中繪製Circle c
        for (int i = 0; i < 360; i++) {
            int col = (int) (c.x + c.r * cosTable[i]); // 欄
            if (col >= 0 && col < board[0].length) {
                int row = (int) (c.y + c.r * sinTable[i]); // 列
                if (row >= 0 && row < board.length) {
                    board[row][col] = '*';
                }
            }
        }
    }

    static void paint(Rect r, char[][] board) { // 在board[][]中繪製Rect r
        // DIY here
         for (int i = 0; i < r.h; i++) { // 繪製高度
            for (int j = 0; j < r.w; j++) { // 繪製寬度
                int row = (int) (r.y + i); // 行
                int col = (int) (r.x + j); // 欄
                if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
                    board[row][col] = '*';
                }
            }
        }
    }    
    
    static void printBoard(char[][] board) { // 印出繪圖板board[][]內容
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static void clearBoard(char[][] board) {
        // DIY 
          for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0; // 清空繪圖板
            }
        }
    }
    }

public class MI2C_HWK7_412631383_02 {
    public static void main(String[] args) {
	char board[][] = new char[60][60] ; //繪圖板
	Circle c1 = new Circle(20,20,10); // 圓心(20,20), r=10
        Rect r1 = new Rect(15,15,30,20) ; // 左上角座標(15,15), w=30, h=20
	        
	 // ==== 呼叫繪圖工具函數 ====
        // (1) 清空繪圖板board[][]
        Plotter.clearBoard(board);
        
        // (2) 將c1, r1繪製在board中
        Plotter.paint(c1, board);
        Plotter.paint(r1, board);
        
        // (3) 印出繪圖版 board[][]
        Plotter.printBoard(board);		
    }
}

