package loops;

import java.util.Scanner;

public class while_ArmstrongSayi {
    public static void main(String[] args) {
        // Verilen bir sayinin Armstrong bir sayi oldugunu kontrol eden code create ediniz.
        // Armstrong sayi =rakamlarinin kupleri toplamina esit olan sayidir
        // 153=(1*1*1) + (5*5*5) + (3*3*3)
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int kuplerToplam = 0;
        int rakam = 0;
        while (sayi != 0) {
            rakam = sayi % 10;
            kuplerToplam += rakam * rakam * rakam;
            sayi = sayi / 10;
        }
        System.out.println(kuplerToplam);

        }
    }
