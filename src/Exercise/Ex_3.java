package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(12);
        System.out.println("Đây là " + checkMonth(number) + ".");
    }

    public static String checkMonth(int number) {
        String[] strings = {"Tháng một", "Tháng hai", "Tháng ba", "Tháng tư", "Tháng năm", "Tháng sáu",
                "Tháng bảy", "Tháng tám", "Tháng chín", "Tháng mười", "Tháng mười một", "Tháng mười hai",};
        return strings[number];
    }
}
