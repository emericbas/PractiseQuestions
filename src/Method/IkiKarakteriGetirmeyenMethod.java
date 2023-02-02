package Method;

import java.util.Scanner;

public class IkiKarakteriGetirmeyenMethod {
    public static void main(String[] args) {
        //String girildiginde ilk iki karakteri haric string return eden Java method yaziniz.
        // Ancak ilk karakter  'g' veya ikinci karakter 'h'  ise bu karakterler de return edilsin.
        // INPUT :  goat  photo   ghost   kalem
        // OUTPUT:  gat    hoto   ghost     lem
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println(ikiKarakterHaric(isim));
    }

    private static String ikiKarakterHaric(String isim) {
        if(isim.startsWith("gh")|| isim.startsWith("GH")) {
          isim=isim;
        }else if(isim.charAt(0)=='g'||isim.charAt(0)=='G' ) {
            isim=isim.substring(0,1)+isim.substring(2);}
        else if( isim.charAt(1)=='H'|| isim.charAt(1)=='h') {
            isim = isim.substring(1);
         } else {
            isim=isim.substring(2);
        }return isim;
    }
}
