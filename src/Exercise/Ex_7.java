package Exercise;

import java.util.*;

public class Ex_7 {

    public static void main(String[] args) {
        int checkNumber = checkRectanglePosition();
        if (checkNumber == 0) {
            System.out.println("Hai hình chữ nhật bọc lấy nhau.");
        } else if (checkNumber == 1) {
            System.out.println("Hai hình chữ nhật giao nhau.");
        } else if (checkNumber == -1) {
            System.out.println("Hai hình chữ nhật nằm ngoài nhau.");
        }
    }

    public static int checkRectanglePosition() {
        double pointX1 = checkDouble("Nhập toạ độ x hình 1: ", "Không hợp lệ. Vui lòng nhập lại.");
        double pointY1 = checkDouble("Nhập toạ độ y hình 1: ", "Không hợp lệ. Vui lòng nhập lại.");
        double length1 = checkDouble("Nhập chiều dài hình 1: ", "Không hợp lệ. Vui lòng nhập lại.");
        double width1 = checkDouble("Nhập chiều rộng hình 1: ", "Không hợp lệ. Vui lòng nhập lại.");
        Rectangle rect1 = new Rectangle(pointX1, pointY1, length1, width1);
        double pointX2 = checkDouble("Nhập toạ độ x hình 2: ", "Không hợp lệ. Vui lòng nhập lại.");
        double pointY2 = checkDouble("Nhập toạ độ y hình 2: ", "Không hợp lệ. Vui lòng nhập lại.");
        double length2 = checkDouble("Nhập chiều dài hình 2: ", "Không hợp lệ. Vui lòng nhập lại.");
        double width2 = checkDouble("Nhập rộng dài hình 2: ", "Không hợp lệ. Vui lòng nhập lại.");
        Rectangle rect2 = new Rectangle(pointX2, pointY2, length2, width2);
        if (checkRectOutsideRect(rect1, rect2)) {
            return -1;
        }
        if(checkRectInsideRect(rect1, rect2)) {
            return 0;
        }
        return 1;
    }

    public static boolean checkRectInsideRect(Rectangle rect1, Rectangle rect2) {
        if (rect1.getPointX() == rect2.getPointX() && rect1.getPointY() == rect2.getPointY()) return true;
        if (rect1.getPointX() > rect2.getPointX())
            checkRectOutsideRect(rect2, rect1);
        if (rect1.getLength() >= rect2.getLength()){
            return rect1.getPointX() + rect1.getLength() / 2 >= rect2.getPointX() + rect2.getLength() / 2 &&
                    rect1.getPointY() - rect1.getWidth() / 2 <= rect2.getPointY() - rect2.getWidth() / 2 &&
                    rect1.getPointX() - rect1.getLength() / 2 <= rect2.getPointX() - rect2.getLength() / 2 &&
                    rect1.getPointY() + rect1.getWidth() / 2 >= rect2.getPointY() + rect2.getWidth() / 2;
        } else {
            return rect1.getPointX() + rect1.getLength() / 2 <= rect2.getPointX() + rect2.getLength() / 2 &&
                    rect1.getPointY() - rect1.getWidth() / 2 >= rect2.getPointY() - rect2.getWidth() / 2 &&
                    rect1.getPointX() - rect1.getLength() / 2 >= rect2.getPointX() - rect2.getLength() / 2 &&
                    rect1.getPointY() + rect1.getWidth() / 2 <= rect2.getPointY() + rect2.getWidth() / 2;
        }
    }

    public static boolean checkRectOutsideRect(Rectangle rect1, Rectangle rect2) {
        if (rect1.getPointX() > rect2.getPointX())
            checkRectOutsideRect(rect2, rect1);
        return rect1.getPointX() + rect1.getLength() / 2 < rect2.getPointX() - rect2.getLength() / 2 ||
                rect1.getPointY() + rect1.getWidth() / 2 < rect2.getPointY() - rect2.getWidth() / 2 ||
                rect1.getPointY() - rect1.getWidth() / 2 > rect2.getPointY() + rect2.getWidth() / 2;
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
