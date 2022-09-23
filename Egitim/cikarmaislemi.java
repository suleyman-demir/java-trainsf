package Egitim;

import java.util.Scanner;

public class cikarmaislemi {

    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);


        System.out.println("hello");
        System.out.println("sayı giriniz;");
        int sayi1 = okuyucu.nextInt();
        System.out.println("sayı giriniz;");
        int sayi2 = okuyucu.nextInt();
        int patlican=hesapMakinasi(sayi1,sayi2);
        System.out.println("sonuç=" +patlican); }


            public static int hesapMakinasi( int sayi1, int sayi2){

            int sonuc = sayi1 - sayi2;
            return sonuc;

        }
        }



