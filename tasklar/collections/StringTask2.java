package tasklar.collections;

import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);
        String cikacak="";
        System.out.println("METİN GİRİNİZ...");

        String girilen=girdi.nextLine();

       // String[] karakterler =girilen.split("");  //ilk başta bunn işe yarayacağını düşündüm ama bu her satıra bir karakter verir akrostiş hesabı

        for (int a=girilen.length()-1;a>=0;--a){
            cikacak += girilen.charAt(a);



        }
        System.out.println(cikacak);


    }
}
