package Exercise;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra: ");
        int year = s.nextInt();
        if (checkLeapYear(year)) {
            System.out.printf("Năm %d là năm nhuận.", year);
        } else {
            System.out.printf("Năm %d không phải là năm nhuận.", year);
        }


    }

    public static boolean checkLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else return year % 4 == 0;
    }
}
