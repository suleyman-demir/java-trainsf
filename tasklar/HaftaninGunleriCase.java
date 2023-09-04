package tasklar;
import java.util.Scanner;

public class HaftaninGunleriCase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int gun;
        System.out.println("1-7 Arasında Bir Rakam Giriniz. = ");
        gun=input.nextInt();

        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;

                case 5:
                    System.out.println("cuma");
                    break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("HATALI GİRİŞ TEKRAR DENEYİNİZ");
                break;
                

        }
      




    }
}
