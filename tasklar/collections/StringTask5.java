package tasklar.collections;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Metin giriniz : ");

        String girdi= scanner.nextLine();



        String[] kelimeler=girdi.split(" ");

        for (int i=0;i< kelimeler.length;i++){


            for (int x= i+1 ;x< kelimeler.length; x++){

                if (kelimeler[i].equals(kelimeler[x])){

                    System.out.println(kelimeler[i]);
                    break;

                }
            }
        }
    }
}
