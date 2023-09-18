package tasklar.collections;

import java.util.ArrayList;
import java.util.List;


public class ArrrayKarssilastirma {
    public static void main(String[] args) {

        List<Integer> dizi1 = new ArrayList<>();     //list <LİSTİMİZİN VERİ TİPİ> ADI = new ArrayList<>(); tanımlaması ile bir arraylist eklenir
        List<Integer> dizi2 = new ArrayList() {{                                //dizi2 adlı arraye add methodu ile 10.20.30 girdileri eklenir
            add(10);
            add(20);
            add(70);
        }};
        List<Integer> dizi3 = List.of(10, 50, 20, 70, 30);   //dizi3 e sırası ile eklemler yapılır


        dizi1.add(10);      //dizi 1 e eklemler yapılır
        dizi1.add(20);
        dizi1.add(30);
        dizi1.add(40);
        System.out.println("liste içerir mi: " + dizi1.contains(30));            //contains methodu dizi1 in içinde 30 u  içerir mi anlamında kullanıldı
        dizi1.add(0, 100);
        System.out.println("tüm liste içerir mi:" + dizi1.containsAll(dizi2));      //contains all metohdu burda dizi 1 dizi 2 içindeki hepsini içerir mi kullanılmış

        List<Integer> yeniListe = dizi1.subList(0, dizi1.indexOf(30));   //dizi 1 in 0 dan 30. indexine kadar olan girdileriyle yeni bir liste oluştu


        
        List<Integer> ortakElemanlar = new ArrayList<>(dizi1);      //ortak elemanlar adında dizi1 ile aynı içeriğe sahip list oluşturma
        ortakElemanlar.retainAll(dizi2);                            //ortakElemanlar listesini sadece dizi2 ile ortak elemanları sakla

        for (int i = 0; i < ortakElemanlar.size(); i++) {                   //ortakları sırasıyka yazdırmak içindir
            System.out.println("ortak elemanlar:" + ortakElemanlar.get(i));
        }

        dizi2.removeAll(ortakElemanlar);                        //dizi2 den ortak elemanlardaki girdileri çıkarır  kullanılacakdizi.removeAllmeyhod(hedef)
        for (int i = 0; i < dizi2.size(); i++) {
            System.out.println("dizi2 de olup dizi1 de olmayan:" + dizi2.get(i));
        }

        dizi1.removeAll(ortakElemanlar);              //  dizi1 den ortak elemanlardaki girdileri çıkarır  kullanılacakdizi.removeAllmeyhod(hedef)
        for (int i = 0; i < dizi1.size(); i++) {
            System.out.println("dizi1 de olan dizi2 olmayan:" + dizi1.get(i));
        }


        dizi1.addAll(ortakElemanlar);               //dizi1 e ortak elemanlardaki girdilerin hepsini ekler
        dizi1.remove(dizi1.indexOf(30));                //dizi1 den remove ile ilk bulunan 30 değeri çıkarılır
        //dizi1.remove("yazi içeren string list");
        //{10,30,20,30,50,30} ==> 5
        dizi1.lastIndexOf(30);                          //indexof methoduyla aynı işi görür ama sondan başa doğru yapar

        System.out.println("son");


    }
}
