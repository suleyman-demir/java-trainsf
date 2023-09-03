package tasklar;


import java.util.Random;
import java.util.Scanner;

public class RandomSayiTutmaDo {
    public static void main(String[] args) {
        int a;

        Random r=new Random();

        a = r.nextInt(11);

        Scanner input=new Scanner(System.in);

        int tahmin;

        int b=1;

        System.out.println("1'den 10'a kadar tutulan bir sayıyı tahmin etmek için 3 hakkınız var.");

        while (b<=3){
            tahmin=input.nextInt();

            if (tahmin==a){
                System.out.println("TAHMİNİNİZ DOĞRU");
                break;
            }else {
                System.out.println("TAHMİNİNİZ YANLIŞ HAK= "+b);
                b++;
            }
        }
        System.out.println("hakkınız bitti, tutulan sayı= " +a);







    }

}

