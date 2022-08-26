package example1;

import java.util.Scanner;

public class IfTrain {

    int basla = 1;

    byte byteSayi = 1;
    short kisaSayi = 123;
    int sayi = 1999999999;
    long buyukSayi = 1999999999;
    float noktaliSayi = 1234234535323423423.5f;
    double virgulluSayi = 12323442342423423423423423423423423423423424324242342343232432432423423432432423432423425467643.9d;
    char harf = 'x';
    static String yazi = "Yazi selam. 123 naber.";
    boolean dogru = true;
    boolean yanlis = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk sayiyi girin:");

        int ilkSayi = scanner.nextInt();

        System.out.println("ikinci sayiyi girin:");

        int ikinciSayi = scanner.nextInt();

        int sonuc = toplamaIslemi(ilkSayi, ikinciSayi);

        System.out.println("sonuc:" + sonuc);

    }

    int sonuc = 0;

    public static int toplamaIslemi(int birincisayi, int ikinciSayi) {
        int sonuc = birincisayi + ikinciSayi;
        return sonuc;
    }
}
