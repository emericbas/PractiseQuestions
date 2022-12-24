package Strings;

import java.util.Scanner;

public class AyniKarakterMi {
    public static void main(String[] args) {
           /*  Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
         Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
         İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 harfli isim giriniz");
        String isim=scan.nextLine();
        if(isim.charAt(0)==isim.charAt(1) && isim.charAt(0)==isim.charAt(2)){
            System.out.println("Dize yinelenen karakterlere sahip");
        }else System.out.println("Dize benzersiz karakterlere sahip");
    }
}
