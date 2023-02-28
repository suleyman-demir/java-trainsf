package Egitim;

import java.util.Scanner;

public class scannerdeneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin");
        int yas = scanner.nextInt();
        int a = yas*365;
        int b = a*24;
        int c = a/7;
        int d = a/30;
        int e = b*60;
        int f = e*60;
        int g = yas*4;
        int x = 75-yas;
        System.out.println(yas + " Yaşındasınız" +"\n" + d + " Aydır yaşıyorsunuz" + "\n" + c +" Haftadır yaşıyorsunuz" +
                "\n"+ a + " Gündür yaşıyorsunuz" +"\n" + b + " Saattir yaşıyorsunuz " + "\n" + e +
                " Dakikadır yaşıyorsunuz" + "\n" + f + " Saniyedir yaşıyorsunuz" + "\n" + "Yaklaşık " + g +  " mevsim geçirdiniz; "+ "\n"
        + yas + "' kış" + "\n" + yas + "' sonbahar" + "\n" + yas + "' ilkbahar" +"\n" + yas + "' yaz olmak üzere " + g + " mevsim" +"\n" +
                a/7*2 + " Kadar Hafta sonu günü geçirdiniz" + "\n"+ a/7+ " Kadar pazartesi günü geçirdiniz" + "\n" + a +
                " Kadar Gündoğumu ve günbatımı gördünüz" + "\n" + e*15 + " kereye yakın nefes aldınız" + "\n" + a*3 +
                " kereye yakın yemek yediniz" + "\n"+ b/3 +" saate yakın uyudunuz" + "\n" + a*2.5f + " Litre kadar su içtiniz"+
                "\n" + c*3 + " kereye yakın duş aldınız" + "\n" + a*4500 +
                " kadar atım attınız"+ "\n"+ x + " (yıl) Tüik verilerine göre ortalama kalan ömrünüz ");
    }
}
