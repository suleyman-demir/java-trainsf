package kurs.giris;

import kurs.orta.Orta;

public class KursGiris {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Object object = 1;
        if(object instanceof Orta){
            System.out.println("bu bir orta nesnesidir.");
            Orta ortaCevirme = (Orta) object;
            System.out.println(ortaCevirme.selamOrtaci());
        }

        if(object instanceof Integer){
            System.out.println("bu bir integer nesnesidir." + (int)object * 2);
        }

    }

    public String sayHi(){
        return "Hi bro";
    }
}
