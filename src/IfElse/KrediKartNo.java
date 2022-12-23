package IfElse;

import java.util.Locale;
import java.util.Scanner;

public class KrediKartNo {
    public static void main(String[] args) {
          /* Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Adiniz ,soyadiniz,kart numaranizi giriniz");
        String ad= scan.nextLine();
        String soyad= scan.nextLine();
        String kartNo=scan.nextLine();
        if(kartNo.length()!=16){
            System.out.println(" Geçersiz kredi kartı numarası");
        }else {
            System.out.println(ad.substring(0,1).toUpperCase(Locale.ROOT)+ad.substring(1).replaceAll("\\w","*")+" "+
                    soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*"));
            System.out.println(kartNo.replaceAll("\\d","*")+kartNo.replaceAll("\\d","*")+
                    kartNo.substring(10));
        }






    }
}
