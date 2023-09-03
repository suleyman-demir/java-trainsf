package tasklar;


import java.util.Random;
import java.util.Scanner;

public class RandomSayiTutmaFor {
    public static void main(String[] args) {
        int a;

        Random r=new Random();

        a = r.nextInt(11);

        Scanner input=new Scanner(System.in);

        int tahmin;



        System.out.println("1'den 10'a kadar tutulan bir sayıyı tahmin etmek için 3 hakkınız var.");

        for (int b=1;b<=3;b++)
         {
            tahmin=input.nextInt();

            if (tahmin==a){
                System.out.println("TAHMİNİNİZ DOĞRU");
                break;
            }else {
                System.out.println("TAHMİNİNİZ YANLIŞ HAK= "+b);
               
            }
        }
        System.out.println("Program Sona Erdi. Tutulan Sayı= "+a);







    }

}

