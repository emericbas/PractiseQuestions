package Method;

import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {
        //Kullanicidan iki sayi ve istedigi islemi alin.(+,/,*-)
        // Bir method  olusturup sayilari istenen isleme tabi tutup
        // sonucu bize dondurun
        //kullanici islemi yanlis secmisse 0 dondurun
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("islem isaretlerini seciniz:\n +=toplama\n-=cikarma\n*=carpma\n/=bolme");
        char islem=scan.next().charAt(0);
        dortIslem(sayi1,sayi2,islem);

    }

    private static double dortIslem(double sayi1,double sayi2,char islem) {
       switch (islem){
           case '+':
               return sayi1+sayi2;
           case '-':
               return sayi1-sayi2;
           case '*':
               return sayi1 *sayi2;
           case '/':
               return sayi1/sayi2;
           default :
               return 0;
       }
    }

}
