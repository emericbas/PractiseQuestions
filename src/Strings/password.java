package Strings;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        //  Ask the user for a password, check the following terms and tell the user any missing
        // terms that need to be corrected, if it satisfies all conditions, print "password saved successfully"
        //  - the first letter must be lowercase
        // - the last character must be a number
        // - the password must not contain spaces
        //  - the length must be at least 10 characters*/
        Scanner scan = new Scanner(System.in);
        System.out.println("passwordunuzu giriniz");
        String sifre = scan.nextLine();

        int flag = 0;
        //  - the first letter must be lowercase
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk olmali");
            flag++;//bir ceza puani aldi
        }
//  - the last character must be a number
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag++;//
            // - the password must not contain spaces
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        //         - the length must be at least 10 characters*/
        if (!(sifre.length() >= 10)) {
            System.out.println("sifeninn uzunlugu 10 karakter olmali");
            flag++;
        }
        if (flag == 0) {
            System.out.println("sifreniz basariyla kaydedildi");
        }

    }
}
