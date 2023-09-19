package tasklar.collections;

public class StringTask1 {
    public static void main(String[] args) {

        String a= "merhaba";
        String b= "merhaba";
        String c= "selam";
        String d="İstanbul";
        String e= "merhaba java nasılsın?";
        String f= "SELAM";
        String x= "Merhaba,Nasılsın,İStanbul,Fatih";
        String y= "       merhaba     ";

        boolean aynimi = a.equals(b);     //aynı mı

        System.out.println(aynimi);

        System.out.println(a.concat(d));   //birlestirme

        System.out.println(e.substring(8,12)); //8 indexten itibaren yazdıracak 12 e kadar yani java

        System.out.println(e.length());  //uzunluk

        System.out.println(e.getBytes());   //byte birimine döndürür

        System.out.println(b.toUpperCase());  // buyuk harfe cevir

        System.out.println(f.toLowerCase());  //kucuk harfe cevir

        System.out.println( e.contains("java"));    //içinde java var mı

        System.out.println(e.replace("a","o"));  // a yı o ya çevir


        String[] cikti=x.split(",");      //virgul ile ayırarak bir diziye atar
        for (String ciktii :cikti) {
            System.out.println(ciktii);
        }

        System.out.println(e.startsWith("merhaba"));  //merhaba ile mi başlıyor diye kontrl eder

        System.out.println(e.endsWith("?"));  // ... ile mi bitiyor

        System.out.println(a.isEmpty()); //a boş mu

        System.out.println(e.charAt(8)); //8.karaktari alır

        System.out.println(e.indexOf('j'));   //j hangi sırada

        System.out.println(y.trim()); //baştaki sondaki boşlukları kaldırır







    }
}
