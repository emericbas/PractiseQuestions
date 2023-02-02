package Method;

public class scope {
     /*
           Eger tum method'lardan kullanilabilecek variable'lar olusturmak isterseniz
           bu variable'lari class level'da olustururuz
           Class level'da olusturulacak variable'lar icin 2 ihtimal vardir
           1- static variable (Class variable)
           2- instance(static olmayan) variable ( obje variable)
           Kural1- static variable'lar tum objeler icin tek bir deger alir
                   instance variable'lar her obje icin java tarafindan cogaltilir
           Kural2-class level variable'lara deger atamasak da kullanabiliriz
                  biz deger atamasakl bile java class level variable'lara default degerler atar
                  non-primitive ==> null (String)
                  sayisal primitive ==> 0
                  char ==> hiclik ''
                  boolean ==> false
          Kural3- static olan method'lardan static olmayan variable ve method'lara direk ulasilmaz
                  instance variable ve static olmayan method'lari static alanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.
          Kural4- class'da olusturulan instance variable'lar ilk deger atamasini yapar
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                  deger atanmamissa default degerleri alir
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class level'daki instance variable'a degil, java tarafindan olusturulup
                  objeye yapistirilan kopya variable'a yapilir
         Kural5- static variable'lar tum objeler icin ortaktir.
                 static variable'lara tum class'dan direk ulasilabilir
                 static variable'in degeri degisirse tum objeler icin degismis olur
         */
}
