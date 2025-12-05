package hwk;

public class MI1C_HWK3_412631383_03 {

    public static int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] accDays = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334}; //需修改

    public static void main(String[] args) {
        int diff = diffInDays(1998, 7, 7, 2008, 4, 30); // 1998/7/7與2008/4/30差幾天
        System.out.println("diff days=" + diff);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int iThDaysOfYear(int y, int m, int d) { //此日期是當年的第幾日 (由1/1算起)
        int days = d;
        for (int i = 1; i <= m - 1; i++) {
            days += monthDays[i];
        }
        if (isLeapYear(y) && m > 2) {
            days++;
        }
        return days;
    }

    public static int diffInDays(int y1, int m1, int d1, int y2, int m2, int d2) {
        int day1=365;
        int day2=(y2-y1-1)*365;
        int day3=iThDaysOfYear(y2,m2,d2)-iThDaysOfYear(y2,m1,d1);
        return day1+day2+day3;

       } 
}
