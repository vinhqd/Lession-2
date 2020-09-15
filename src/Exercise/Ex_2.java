package Exercise;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int num = checkInt("Nhập vào một số nguyên (từ 0 - 11): ",
                "Vui lòng nhập vào một số nguyên (từ 0 - 11): ", 0 , 11);
        System.out.println("Đây là năm con: " + checkYear(num) + ".");
    }

    public static String checkYear(int number) {
        String[] strings = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
        return strings[number];
    }

    public static int checkInt(String mess, String errMes, int minValue, int maxValue) {
        Scanner s = new Scanner(System.in);
        int num;
        do {
            try {
                System.out.println(mess);
                num = Integer.parseInt(s.nextLine());
                if (num >= minValue && num <= maxValue) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println(errMes);
            }
        } while (true);
    }
}
