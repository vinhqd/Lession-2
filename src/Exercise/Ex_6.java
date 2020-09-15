package Exercise;

import java.util.Random;

public class Ex_6 {
    public static void main(String[] args) {
        String[] cards = {"Át", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"Rô", "Cơ", "Bích", "Tép"};
        System.out.printf("Lá bài bạn vừa rút ra là %s %s", cards[random(cards.length)], types[random(types.length)]);
    }

    public static int random(int bound) {
        return new Random().nextInt(bound);
    }
}
