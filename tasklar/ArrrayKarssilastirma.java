package tasklar;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Arrays;


public class ArrrayKarssilastirma {
    public static void main(String[] args) {
        int i;
        int x = 0;
        Random r = new Random();
        int[] dizi1 = new int[10];
        int[] dizi2 = new int[10];

        for (x = 0; x <= 9; x++) {
            dizi1[x] = r.nextInt(7)+1;
            System.out.println("1. DİZİ ELEMAN = "+x+". = " +dizi1[x]);


        }

        for (x = 0; x <= 9; x++) {
            dizi2[x] = r.nextInt(7)+1;
            System.out.println("2. DİZİ ELEMAN = "+x+". = " +dizi2[x]);

        }
        for (x = 0; x <= 9; x++) {
            if (dizi1[x] == dizi2[x]) {
                System.out.println("BİRİNCİ VE İKİNCİ DİZİNİN " + x + ". BASAMAĞI = " + dizi1[x] + " OLARAK AYNIDIR.");
            } else {
                System.out.println("BİRİNCİ DİZİDE "+x+". SIRA = "+dizi1[x]+" VE İKİNCİ DİZİDE "+x+". SIRA = "+dizi2[x]+" OLDUĞUNDAN EŞİT DEĞİLDİR.");

            }


        }


    }
}
