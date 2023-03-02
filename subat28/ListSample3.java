package subat28;

import java.util.Scanner;

public class ListSample3 {

    public static void main(String[] args) {

        System.out.println("Lütfen kelimeler arası virgül işareti ile cümle girişi yapınız : ");

        Scanner girdi = new Scanner(System.in);

        String mesaj = girdi.nextLine();

        System.out.println(mesaj);

        String[] kelimeler= mesaj.split(",");

        String[] dizi1 = new String[15];

        for (int i=0;i< kelimeler.length; i++){
            dizi1[i] = kelimeler[i];
            System.out.println(i+"- "+dizi1[i]);
        }
        System.out.println("Dizi Uzunluğu : "+dizi1.length);







    }
}
