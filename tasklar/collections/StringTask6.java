package tasklar.collections;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        System.out.println("bir kelime giriniz : ");
        Scanner scanner = new Scanner(System.in);

        String girdi = scanner.nextLine();

        String tersten = "";

        String[] bolme = girdi.split("");

        for (int x = bolme.length - 1; x >= 0; --x) {

            tersten += bolme[x];

        }


        if (girdi.equals(tersten)) {
            System.out.println("Girilen kelime tersi ile aynıdır : " + girdi);
        } else {
            System.out.println("Girilen kelime tersi ile aynı değil : " + girdi);


        }
    }
}