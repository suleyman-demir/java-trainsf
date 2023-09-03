package tasklar;

public class OperatorTipleri {
    public static void main(String[] args) {
        int x =8;
        int z=2;
        boolean a=true;
        boolean blo=false;

        //MATEMATİK OPERATORLERİ
        System.out.println(x-z);
        System.out.println(x+z);
        System.out.println(z*x);
        System.out.println(x/z);
        //KARSILASTIRMA OPERATORLERİ
        System.out.println(x==z);
        System.out.println(x!=z);
        System.out.println(x<z);
        System.out.println(x>z);
        System.out.println(x>=z);
        System.out.println(x<=z);
        //MANTIKSAL
        System.out.println((x<z) && (x>z));

        if (x>5 || x<10){
            System.out.println("sayi 5 den buyuk");

        } else {
            System.out.println("sayi 5 ile 10 arasinda degil");
        }

        boolean b =!a;
        System.out.println(b);



    }
}
