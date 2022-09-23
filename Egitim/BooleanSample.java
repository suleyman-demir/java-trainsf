package Egitim;

public class BooleanSample {

    public static void main(String[] args) {
        boolean dogruYanlis1 = true;
        boolean dogruYanlis2 = false;
        boolean dogruYanlis3 = 3 > 5;
        boolean dogruYanlis4 = 3 == 5; // eşit mi
        boolean dogruYanlis5 = 3 <= 5; // küçük eşit mi
        boolean dogruYanlis6 = 3 != 5; // eşit değil mi

        String yazi = "selam";
        boolean ilkHarf = 's' == yazi.charAt(0);

        System.out.println("☺♣ dogruYanlis3:" + dogruYanlis3 + "\n☺ dogruYanlis4:" + dogruYanlis4 + "\n☺ dogruYanlis5:" + dogruYanlis5 + "\n☺ dogruYanlis6:" + dogruYanlis6);
    }
}
