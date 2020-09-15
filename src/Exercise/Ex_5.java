package Exercise;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        double pointX = checkDouble("Nhập toạ độ x: ", "Không hợp lệ. Nhập lại.");
        double pointY = checkDouble("Nhập toạ độ y: ", "Không hợp lệ. Nhập lại.");
        if (checkPoint(pointX, pointY))
            System.out.printf("Điểm (%.1f, %.1f) nằm trong hình chữ nhât (0, 0) chiều dài 10, chiều rông 5.",
                    pointX, pointY);
        else
            System.out.printf("Điểm (%.1f, %.1f) không nằm trong hình chữ nhât (0, 0) chiều dài 10, chiều rông 5.",
                    pointX, pointY);
    }

    public static boolean checkPoint(double pointX, double pointY) {
        if (Math.abs(pointX) >= 5 && Math.abs(pointY) >= 2.5) return false;
        return Math.abs(pointX) < 2.5 && Math.abs(pointY) < 5;
    }

    public static double checkDouble(String mess, String errMes) {
        Scanner s = new Scanner(System.in);
        double num;
        do {
            try {
                System.out.println(mess);
                num = Double.parseDouble(s.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println(errMes);
            }
        } while (true);
    }
}
