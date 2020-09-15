package Exercise;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        int[] set1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
        int[] set2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
        int[] set3 = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
        int[] set4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
        int[] set5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21};
        int date = 0;
        date += checkSet(set1) ? set1[0] : 0;
        date += checkSet(set2) ? set2[0] : 0;
        date += checkSet(set3) ? set3[0] : 0;
        date += checkSet(set4) ? set4[0] : 0;
        date += checkSet(set5) ? set5[0] : 0;
        System.out.println("Ngày sinh của bạn là: " + date);
    }

    public static boolean checkSet(int[] set) {
        Scanner s = new Scanner(System.in);
        String answer;
        while (true) {
            tableSet(set);
            System.out.println("Ngày sinh của bạn có năm trong tập số trên không(Y/n)?: ");
                answer = s.nextLine();
                if (answer.toLowerCase().equals("y")) return true;
                if (answer.toLowerCase().equals("n")) return false;
                else System.out.println("Vui lòng nhập Y hoặc N.");

        }
    }

    public static void tableSet(int[] set) {
        System.out.println("");
        for (int i = 1; i <= set.length; i++) {
            System.out.printf("%d\t", set[i - 1]);
            if (i % 4 == 0) System.out.println("");
        }
    }
}
