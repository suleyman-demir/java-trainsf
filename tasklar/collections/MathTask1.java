package tasklar.collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MathTask1 {
    public static void main(String[] args) {
        Map<String,Double> musterinobakiye = new HashMap<>();
        musterinobakiye.put("Süleyman Demir - Müşteri No: 1", 10090d);
        musterinobakiye.put("Fatih Akay - Müşteri No: 2", 232d);
        musterinobakiye.put("Hüseyin Aktepe - Müşteri No: 3", -129d);
        musterinobakiye.put("Melike Arslantaş - Müşteri No: 4", 104.78d);
        musterinobakiye.put("Selim Kayhan - Müşteri No: 5", 1081.27d);
        musterinobakiye.put("Ayşe Nur Özer - Müşteri No: 6", 9d);


        Set<String> adsoyad = musterinobakiye.keySet();

        System.out.println("\nDEMİR BANK'a Hoşgeldiniz... \n \n");
        for (String no : adsoyad) {
            Double bakiye = musterinobakiye.get(no);
            System.out.println(no + ", Bakiye: " + bakiye+" TL\n");

        }
        System.out.println("-------------------------------------------\nEn Düşük Bakiye : "+Math.min(musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3"),(musterinobakiye.get("Süleyman Demir - Müşteri No: 1")) )+" TL" );   //EN DÜŞÜK BAKİYELİ HESABI MATH MİN METHODU İLE YAZDIRMANIN TEK YOLU

        System.out.println("-------------------------------------------\nEn Yüksek Bakiye : "+Math.max(musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3"),(musterinobakiye.get("Süleyman Demir - Müşteri No: 1")))+" TL");  //MAX BAKİYE

        System.out.println("-------------------------------------------\nYukarı Yuvarlanacak Bakiye Eski Hali : "+musterinobakiye.get("Melike Arslantaş - Müşteri No: 4")+" TL "+" Yeni Hali : "+Math.ceil(musterinobakiye.get("Melike Arslantaş - Müşteri No: 4"))+" TL");

        System.out.println("-------------------------------------------\nAşağı Yuvarlanacak Bakiye Eski Hali : "+musterinobakiye.get("Selim Kayhan - Müşteri No: 5")+" TL "+" Yeni Hali : "+Math.floor(musterinobakiye.get("Selim Kayhan - Müşteri No: 5"))+" TL");

        System.out.println("-------------------------------------------\nPozitife Dönüştürülecek Bakiye Eski Hali : "+musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3")+" TL "+" Yeni Hali : "+Math.abs(musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3"))+" TL");

        System.out.println("-------------------------------------------\nKaresi Hesaplanacak Bakiye Eski Hali : "+musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3")+" TL "+" Yeni Hali : "+Math.pow(musterinobakiye.get("Hüseyin Aktepe - Müşteri No: 3"),(2))+" TL");

        System.out.println("-------------------------------------------\nKare Kökü Hesaplanacak Bakiye Eski Hali : "+musterinobakiye.get("Ayşe Nur Özer - Müşteri No: 6")+" TL "+" Yeni Hali : "+Math.sqrt(musterinobakiye.get("Ayşe Nur Özer - Müşteri No: 6"))+" TL");


        System.out.println("-------------------------------------------\n\n BİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ.\n                DEMİR BANK");





    }
}
