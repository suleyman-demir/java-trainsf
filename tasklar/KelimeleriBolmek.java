package tasklar;
import java.util.Arrays;
import java.util.Scanner;

public class KelimeleriBolmek {
    public static void main(String[] args) {

        Scanner cumle=new Scanner(System.in);

        System.out.println("LÜTFEN KELİMELERİ VİRGÜL İŞARETİ İLE BÖLEREK CÜMLE GİRİNİZ");

        String kelime=cumle.nextLine();

        String[] kelimeler=kelime.split(",");




        for (int i=0;i<kelimeler.length;i++){

            System.out.println(kelimeler[i]);

        }
        System.out.println("dizi uzunluğu: "+kelimeler.length);


        }





    }

