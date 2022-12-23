package Numbers;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
           /*  Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin rakamlari toplamini ekranda yazdirin.
        */

        System.out.println("Please enter a number with three digits");
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli sayi giriniz");
        int threeDigit=scan.nextInt();
        int sumOfNumber=0;
        for (int i = 3; i >=1; i--) {
            sumOfNumber  +=  threeDigit%10;
            threeDigit=threeDigit/10;

        }
        System.out.println(sumOfNumber);
    }
}
