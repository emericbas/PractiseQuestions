package Strings;

import java.util.Scanner;

public class ContainsBosluk {
    public static void main(String[] args) {
        //valueOf(),  parseInt()    ===>"1234"(String)'i int 1234'e cevirirler
        //Kullanicidan aldiginiz bir yazi da bosluk var mi diye kontrol ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir text giriniz");
        String text=scan.nextLine();
        System.out.println(text.contains(" "));
        System.out.println(text.isEmpty());

        //Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz
        // ad ayri soyad ayri sekilde ekrana yazdiriniz
        System.out.println(" ad ve soyad bilgileri giriniz");
        String adSoyad= scan.nextLine();
        int indexOfbosluk=adSoyad.indexOf(" ");
        System.out.println(" Ad = "+adSoyad.substring(0,indexOfbosluk)+"\nSoyad = "+adSoyad.substring(indexOfbosluk+1));
    }
}
