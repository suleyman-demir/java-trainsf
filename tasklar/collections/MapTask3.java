package tasklar.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;


public class MapTask3 {
    public static void main(String[] args) {
        Map<Integer,Integer> ogrenci = new HashMap<>();

        ogrenci.put(1001,63);
        ogrenci.put(1002,40);
        ogrenci.put(1003,88);
        ogrenci.put(1004,91);
        ogrenci.put(1005,19);
        int i=0;

        Set<Integer> keyListesi = ogrenci.keySet();
        for (Integer key: keyListesi) {
            System.out.println("Öğrenci ="+ ++i+"= "+ ogrenci.get(key));

        }
        i=0;

        System.out.println("Kaldırmak istediğiniz öğrenci NO giriniz : ");

        Scanner scanner = new Scanner(System.in);
        int ogrenciNo = scanner.nextInt();

        ogrenci.remove(ogrenciNo);

        System.out.println("ÖĞRENCİ BAŞARI İLE KALDIRILDI\n LİSTENİN GÜNCEL HALİ;");

        for (Integer key: keyListesi) {
            System.out.println("Öğrenci ="+ ++i+"= "+ ogrenci.get(key));

        }







    }
}
