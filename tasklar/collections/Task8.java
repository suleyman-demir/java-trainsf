package tasklar.collections;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz : ");
        Scanner scanner=new Scanner(System.in);
        int girdi=scanner.nextInt();

        for (int i=2;i<=girdi;i++){
            if (girdi% i==0){
                System.out.println(i);
                girdi=girdi/i;
            }
        }
    }
}
