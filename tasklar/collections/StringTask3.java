package tasklar.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);

        System.out.println("METİN GİRİNİZ...");

        String girilen=girdi.nextLine();

        Map<Character,Integer> harita=new HashMap<>();
        char[] harfler = girilen.replaceAll("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z","").toCharArray();

        for (char harf:harfler){
          if (harita.containsKey(harf)){

              harita.put(harf,harita.get(harf)+1);


          }else {

              harita.put(harf,1);

          }
        }

        char enfazla = ' ';
        int  sayisi= 0;

        for (Map.Entry<Character,Integer>entry:harita.entrySet()) {

            if (entry.getValue() > sayisi) {
                enfazla = entry.getKey();
                sayisi = entry.getValue();
            }
        }

        System.out.println(enfazla+" "+sayisi+" - Kez tekrar edildi.");

    }
}
