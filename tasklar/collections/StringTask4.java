package tasklar.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Metin giriniz: ");
        String girdi = scanner.nextLine();


        String[] kelimeler=girdi.split(" ");

        String cikicak="";

        for (int i=0;i<=kelimeler.length-1;i++) {

            String cikti = kelimeler[i].substring(0, 1).toUpperCase() + kelimeler[i].substring(1);

            cikicak +=" "+ cikti;



        }

        System.out.println(cikicak);

    }
}
