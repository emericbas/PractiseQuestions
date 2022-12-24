package Strings;

import java.util.Scanner;

public class SonUcHarfinKopyasi {
    public static void main(String[] args) {
              /* Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
         Alınan kelimenin son 3 harfinin 2 kopyasından oluşan
       yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
              */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine();
        while (isim.length()<5) {
            System.out.println("5 karakterli bir isim giriniz");
          break;
        }
        if(isim.length()>=5){
            System.out.println(isim.substring(isim.length()-3,isim.length())+isim.substring(isim.length()-3,isim.length()));
        }
































































    }
}
