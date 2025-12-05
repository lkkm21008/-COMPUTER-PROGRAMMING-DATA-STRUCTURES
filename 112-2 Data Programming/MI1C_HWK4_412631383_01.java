
package hwk;

import java.util.*;
public class MI1C_HWK4_412631383_01 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.println("密碼長度:");
        int x =cin.nextInt(); 
        System.out.println("使用字元集 (1)完整字元集 (2)不含數字:");
        int a=cin.nextInt();
        System.out.println("第一碼是否為英文字母 (y/n) ?");
        String b=cin.next();
        System.out.println("字元是否可重複使用 (y/n) ?");
        String c=cin.next();
        System.out.println("初始密碼 :"+password(x,a,b,c));
    }
    public static String password(int x,int a ,String b,String c){
   char[] charset;
        if (a == 1) {
            charset = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                                  'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                                  'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
                                  'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                  'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                  'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
                                  '8', '9'};
        } else {
            charset = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                                  'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                                  'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
                                  'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                  'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                  'y', 'z'};
        }
        
        Random random = new Random();
        char[] password = new char[x];
        
        // 根據用戶輸入，將第一碼固定為英文字母
        if (b.equalsIgnoreCase("y")) {
            int index = random.nextInt(52); // 52 是英文字母的總數
            password[0] = charset[index];
        } else {
            int index = random.nextInt(charset.length);
            password[0] = charset[index];
        }
        
        // 根據用戶輸入，判斷是否重複使用字元
        for (int i = 1; i < x; i++) {
            int index = random.nextInt(charset.length);
            if (c.equalsIgnoreCase("n")) {
                // 如果不重複使用字元，則需要確保新生成的字元不與之前的字元相同
                while (passwordContains(password, charset[index])) {
                    index = random.nextInt(charset.length);
                }
            }
            password[i] = charset[index];          
        }
        
        return new String(password); 
    }
    
    public static boolean passwordContains(char[] password, char c) {
        for (char ch : password) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
}
