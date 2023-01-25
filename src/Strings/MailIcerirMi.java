package Strings;

import java.util.Scanner;

public class MailIcerirMi {
    public static void main(String[] args) {
        //SORU;Kullanicidan bir mail alin
        //1) @ icermiyorsa "gecersiz mail"
        //2) @gmail.com icermiyorsa " gmail olmali"
        // 3) @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz?");
        String mail=scan.nextLine();
        if(!mail.contains("@")){
            System.out.println("gecersiz mail");
        }else if (!mail.contains("@gmail.com")){
            System.out.println(" gmail olmali");
        }else if ((!mail.endsWith( "@gmail.com"))){
            System.out.println("mailde yazim hatasi var");
        }else System.out.println("Dogru mail");
    }
}
