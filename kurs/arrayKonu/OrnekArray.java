package kurs.arrayKonu;

import kurs.orta.Orta;

public class OrnekArray {

    public static void main(String[] args) {
        int sayi = 5;
        float f = 5;
        double d = 5;
        Integer i1 = Integer.valueOf(1);
        String s1 = "selam";

        String[] isimler = new String[2];
        Orta orta = new Orta();
        orta.selamOrtaci();

        isimler[0]="süleyman";
        isimler[1]="bilal";
        isimler[1]= null;

        System.out.println(isimler[0].length());
        System.out.println(isimler[1]);
        System.out.println(isimler.length);
    }
}
