package tasklar;
import java.util.Scanner;

public class HaftaninGunleriif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gun;
        System.out.println("1-7 Arasında Bir Rakam Giriniz. = ");
        gun=input.nextInt();

        if (gun==1){
            System.out.println("Girdiğiniz sayıya gelen karşılık PAZARTESİ");
        } else if (gun==2) {
            System.out.println("Girdiğiniz sayıya gelen karşılık SALI");


        } else if (gun==3) {
            System.out.println("Girdiğiniz sayıya gelen karşılık carsamba");

        } else if (gun==4) {
            System.out.println("Girdiğiniz sayıya gelen karşılık persembe");

        } else if (gun==5) {
            System.out.println("Girdiğiniz sayıya gelen karşılık cuma");


        } else if (gun==6) {
            System.out.println("Girdiğiniz sayıya gelen karşılık ctesi");

        } else if (gun==7) {
            System.out.println("Girdiğiniz sayıya gelen karşılık PAzar");


        } else if (gun>7 || gun<1 ) {
            System.out.println("hatalı giris yaptınız tekrar deneyiniz");

        }
    }
}
