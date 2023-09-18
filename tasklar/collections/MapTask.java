package tasklar.collections;

import java.util.*;

public class MapTask {


    public static void main(String[] args) {
        Map<Integer,String> ogrenciler = new HashMap<>();           //bir map oluşturulur MAP <veritpix,veritipiz> isim = new HashMap<>();
        ogrenciler.put(12354,"Süleyman Demir");                                     //değer atama yapılır   KEY/VALUE ŞEKLİNDE
        ogrenciler.put(135420, "bilal demir");

        System.out.println("süleyman map te mi:" + ogrenciler.containsValue("Süleyman Demir"));         //containsvalue methodu ile key yerine value üzerinden istediğimiz değeri oğrencilerin icinden arar cıktı true false olur
        System.out.println("key map te mi"+ ogrenciler.containsKey(12354));                         //üsttekinin aynısını key üzerinden mapte sorgular
        System.out.println("get or default: "+ogrenciler.getOrDefault(123,"varsayilan"));       //123 anahtarı ile biri varsa getirir yoksa default verir ve varsayılan yazar
        Set<Integer> keyListesi = ogrenciler.keySet();                      //int değerinde key listesi adında içeriğini oğrencilerin keyinden çeken bir list oluşturduk
        for (Integer key: keyListesi) {                                     //oğrenciler haritasına yeni değer ekler
            System.out.println(ogrenciler.get(key));
            ogrenciler.put(key,"yeni değer");
        }

        List<String> values = new ArrayList<>(ogrenciler.values());       //values adında içeriğini öğrencilerin valuelerinden ceken bir array olusturukur
        for (int i =0; i<values.size();i++){                                //valuesin boyutu kadar çalışması için döngü kurulur
            System.out.println(values.get(i));                              //her dönüşünde sırasıyla valuesleri yazdırır
        }
        Map<Integer,String> yeniMap = new HashMap<>();                  //yeni bir map oluşturulur int stringşeklinde
        ogrenciler.putAll(yeniMap);                                     //yeni mapindeki tum girdileri ogrenciler mapine alır





    }
}
