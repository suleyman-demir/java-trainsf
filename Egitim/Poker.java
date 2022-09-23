package Egitim;

import java.util.Random;

public class Poker {

    public static void main(String[] args) {
        for (int x = 1; x < 100; x++) {
            Random rnd = new Random();
            int kart;
            kart = rnd.nextInt( 1,4);
            if (kart == 1) {
                System.out.println("♣");
            } else {
                System.out.println("♥");
            }
            int sayi = rnd.nextInt(1, 11);
            System.out.println(" " + sayi);
            System.out.println("---");
        }
    }
}
