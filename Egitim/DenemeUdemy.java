package Egitim;

import java.util.Scanner;

public class DenemeUdemy {

    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("sayi gir;");
        int sayi1=okuyucu.nextInt();
        System.out.print("sayi gir;");
        int sayi2=okuyucu.nextInt();
        int patlican=hesapMakinasi(sayi1,sayi2);
        System.out.println("sonuc="+patlican);


    }

    public static int hesapMakinasi(int sayi1,int sayi2) {
        int sonuc = sayi1+sayi2;
        return sonuc;

    }
}
