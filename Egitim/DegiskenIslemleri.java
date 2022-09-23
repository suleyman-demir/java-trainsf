package Egitim;

public class DegiskenIslemleri {

    public static void main(String[] args) {
        byte x1;

        byte a = 1;
        short b = 2;
        int c = 3;
        long longDegisken = 4;
        float floatDegisken = 5;
        double doubleDegisken = 6;

        doubleDegisken = floatDegisken;
        floatDegisken = (long)doubleDegisken;
        floatDegisken = (float)doubleDegisken;
        longDegisken = (int)doubleDegisken;

        System.out.println( "Merhaba Suleyman :");
    }

}
