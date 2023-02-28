package kurs.orta;

public class OrtaUstu {

    private int sayi1;
    private int sayi2;
    private int sayi3;
    public OrtaUstu() {

    }

    public OrtaUstu(int sayi1){
        this.sayi1 = sayi1;
    }

    public OrtaUstu(int sayi1, int sayi2, int sayi3) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.sayi3 = sayi3;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public void setSayi3(int sayi3) {
        this.sayi3 = sayi3;
    }

    public int getSayi1(){
        return this.sayi1;
    }

    public static void main(String[] args) {
        for(int i=0; i<5;i+=2){
            System.out.println(i);
        }

        System.out.println("gün");
        String str="salı";
        switch (str){
            case "pazartesi":
                System.out.println(1);
                break;
            case "salı":
                System.out.println(2);
                break;
            default:
                System.out.println("yanlış");
        }
        int i = 5;
        do{
            System.out.println(i--);
        }while (i>0);

        while (i<5){
            System.out.println(i++);
        }

        if(i<5){

        }else if(i>10){

        }else {


        }
    }
    public String say(String mesaj){
        return "selam " + mesaj;
    }
}
