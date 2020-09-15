package Exercise;

import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {
        double edge1 = checkDouble("Nhập cạnh hình tam giác 1: ", "Không hợp lệ. Nhập lại.");
        double edge2 = checkDouble("Nhập cạnh hình tam giác 2: ", "Không hợp lệ. Nhập lại.");
        double edge3 = checkDouble("Nhập cạnh hình tam giác 3: ", "Không hợp lệ. Nhập lại.");
        double p;
        if (checkTriangle(edge1, edge2, edge3)) {
            p = edge1 + edge2 + edge3;
            System.out.println("Chu vi hình tam giác là: " + p);
        } else {
            System.out.println("3 cạnh nhập vào không tạo thành hình tam giác.");
        }

    }

    public static boolean checkTriangle(double edge1, double edge2, double edge3) {
        return edge1 + edge2 > edge3 && edge1 + edge3 > edge2 &&
                edge2 + edge3 > edge1;
    }

    public static double checkDouble(String mess, String errMes) {
        Scanner s = new Scanner(System.in);
        double num;
        do {
            try {
                System.out.println(mess);
                num = Integer.parseInt(s.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println(errMes);
            }
        } while (true);
    }

}
