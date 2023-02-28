package kurs.orta;

import kurs.giris.KursGiris;

public class Orta {

    public Orta() {

    }

    public static void main(String[] args) {
        KursGiris giris = new KursGiris();
        System.out.println(giris.sayHi());

        OrtaUstu ustu = new OrtaUstu();
        ustu.setSayi1(1);
        ustu.setSayi2(2);
        ustu.setSayi3(3);
        System.out.println("Elle setleme yaptık");
        System.out.println(ustu.getSayi1());

        OrtaUstu ustuGelismis = new OrtaUstu(11,22,33);
        System.out.println("Yapıcı method ile setleme yaptık");
        System.out.println(ustuGelismis.getSayi1());

        String ortaninMesaji = ustu.say("naber dostum");
        System.out.println(ortaninMesaji);
    }

    public String selamOrtaci(){
        return "selam ortaci";
    }
}
