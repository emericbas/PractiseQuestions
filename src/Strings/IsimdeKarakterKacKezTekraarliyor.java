package Strings;

import java.util.Scanner;

public class IsimdeKarakterKacKezTekraarliyor {
    public static void main(String[] args) {
           /* Soru 17-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
            */

     //   char ch1='a';
      //  String name ="Ali bakkala geç gitti.";
       // Beklenen Çıktı= a sayısı = 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Bir karakter giriniz");
        char chr = scan.next().charAt(0);
        int counter=0;
        for (int i = 0; i <isim.length() ; i++) {
            if(isim.charAt(i)==(chr)){
                counter++;

            }
        }
        System.out.println(isim+" icerisinde "+counter+" tane "+chr+" bulunuyor");

    }
}
