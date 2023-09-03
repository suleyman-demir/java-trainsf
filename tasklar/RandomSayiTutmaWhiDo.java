package tasklar;


import java.util.Random;
import java.util.Scanner;

        public class RandomSayiTutmaWhiDo {
            public static void main(String[] args) {
                int a;

                Random r = new Random();

                a = r.nextInt(11);

                Scanner input = new Scanner(System.in);

                int tahmin;

                int b = 1;

                System.out.println("1'den 10'a kadar tutulan bir sayıyı tahmin etmek için 3 hakkınız var.");

                do {
                    tahmin = input.nextInt();

                    if (tahmin == a) {
                        System.out.println("TAHMİNİNİZ DOĞRU");
                        break;
                    } else {
                        System.out.println("TAHMİNİNİZ YANLIŞ HAK= " + b);
                        b++;

                    }



                } while (b <= 3) ;

               if (tahmin != a)
               {
                   System.out.println("hakkınız bitti, tutulan sayı= " + a);
               }




            }
        }
