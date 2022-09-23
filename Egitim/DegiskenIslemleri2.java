package Egitim;

public class DegiskenIslemleri2 {

    public static void main(String[] arg) {
        String cumle = "selam nasılsın?";


        for (int i = 0; i < cumle.length(); i = i + 1) {
            char karakter = cumle.charAt(i);
            System.out.println(karakter);
        }


        char karakter = cumle.charAt(0);
        System.out.println("ilk harf: [" + karakter + "]");


        char karakterSon = cumle.charAt(cumle.length() - 1);
        System.out.println("ilk harf: [" + karakterSon + "]");
    }
}
