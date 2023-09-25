package tasklar.collections;

import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        String girdi = scanner.nextLine();

        switch (girdi.length()){
            case 0:
                System.out.println("Hatalı Giriş");
                break;
            case 1: System.out.println("Girilen sayı birler basamağındandır-1 basamaklı");
                break;
            case 2: System.out.println("Girilen sayı onlar basamağındandır-2 basamaklı");
                break;
            case 3:System.out.println("Girilen sayı yüzler basamağındandır-3 basamaklı");
                break;
            case 4:System.out.println("Girilen sayı binler basamağındandır-4 basamaklı");
                break;
            case 5: System.out.println("Girilen sayı on binler basamağındandır-5 basamaklı");
                break;
            case 6: System.out.println("Girilen sayı yüz binler basamağındandır-6 basamaklı");
                break;
            case 7: System.out.println("Girilen sayı milyonlar basamağındandır-7 basamaklı");
                break;
            case 8: System.out.println("Girilen sayı on milyonlar basamağındandır-8 basamaklı");
                break;
            case 9: System.out.println("Girilen sayı yüz milyonlar basamağındandır-9 basamaklı");
                break;
            case 10: System.out.println("Girilen sayı milyarlar basamağındandır-10 basamaklı");
                break;
            case 11: System.out.println("Girilen sayı on milyar basamağındandır-11 basamaklı");
                break;
            case 12: System.out.println("Girilen sayı yüz milyar basamağındandır-12 basamaklı");
                break;
            case 13: System.out.println("Girilen sayı trilyonlar basamağındandır-13 basamaklı");
                break;



        }

    }
}
