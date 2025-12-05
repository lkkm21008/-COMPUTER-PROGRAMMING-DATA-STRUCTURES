
package homework;


public class MI1C_HWK1_412631383_04 {
    public static void main(String[] args) {
        int dc=20190918;
        int y = dc/10000;
        int m =(dc%10000)/100;
        int d =dc%100;
        System.out.printf("date=%04d%02d%02d\n", y, m ,d );
System.out.printf("date=%04d/%02d/%02d\n", y, m, d) ;
    }
}
