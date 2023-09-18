package tasklar.collections;
import java.util.HashMap;
import java.util.Map;

import java.util.*;

import java.util.Collection;
public class MapTask2 {
    public static void main(String[] args) {
     Map<Integer,Integer> ogrenci = new HashMap<>();

     ogrenci.put(1001,63);
     ogrenci.put(1002,40);
     ogrenci.put(1003,88);
     ogrenci.put(1004,91);
     ogrenci.put(1005,19);


        Collection<Integer> values = ogrenci.values();

        int dusuk = Collections.min(values);
        int yuksek = Collections.max(values);
        double ortalama=0;

        for (int value : values){
            ortalama += value ;
        }
        ortalama = ortalama/ogrenci.size();
        System.out.println("En düşük not = " + dusuk +"\n"+ "En yüksek not = " + yuksek+"\n"+ "Not ortalaması = "+ ortalama+"\nSınava katılan öğrenci sayısı = " + ogrenci.size());

    }
}
