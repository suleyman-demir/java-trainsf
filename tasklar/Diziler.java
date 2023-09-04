package tasklar;
import java.util.Arrays;

public class Diziler {
    public static void main(String[] args) {

        int[] dizi={5,-7,8,33,3,67,-9879,34,78,-90};

       /* int b=0;
        do {
            System.out.println(dizi [b]);         //WHİLE DÖNGÜSÜ İLE EKRANA YAZDIRMA
            b++;

        }while ( b<=9);
        */



        //System.out.println(Arrays.toString(dizi));   //DİREKT METOD KULLANARAK EKRANA YAZDIRMA



       // Arrays.fill(dizi, 0, 1, 99);        //istediğimiz alana yeni bir atama yapmak içindir kaçtan,kaça,atanacak değer formatında kullanılır
       // System.out.println(Arrays.toString(dizi));

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));  //dizi içindeki elamanları küçükten büyüğe sıralar


    }
}
