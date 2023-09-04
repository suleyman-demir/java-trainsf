package kurs.orta;
import java.util.Scanner;

public class HaftaninGunleri {
    public static void main(String[] args) {

        Scanner sayial = new Scanner(System.in);
        System.out.println("1-7 arasında sayi giriniz: ");
        int rakam =sayial.nextInt();
        System.out.println("girilen sayı = " + rakam);

        switch (rakam){
            case 1:
                System.out.println("pazartesi");
            break;

            case 2:
                System.out.println("salı");
            break;

            case 3:
                System.out.println("çarşamba");
            break;

            case 4:
                System.out.println("perşembe");
            break;

            case 5:
                System.out.println("cuma");
            break;

            case 6:
                System.out.println("ctesi");
            break;

            case 7:
                System.out.println("pazar");

            default:
                System.out.println("GEÇERSİZ GİRİŞ");
        }



    }

    public static void yaz(){
        System.out.println("yazdırdım.");
    }
}
