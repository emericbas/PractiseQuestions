package loops;

import java.util.Scanner;

public class BesinKatlari {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerlerini alip sinirlar dahil olarak ,
        // bu sayilar arasinda 5'in kati sayilari yazdirinToplamlarini  bulun
        Scanner scan=new Scanner(System.in);
        System.out.print("baslangic degerini alin");
        int baslangic= scan.nextInt();
        System.out.print("bitis degerini gir");
        int bitis= scan.nextInt();
        int toplam=0;
        for (int i = baslangic; i <= bitis ; i++) {

            if(i%5==0){
                toplam+=i;
                System.out.print(i+" ");
            }}
        System.out.println();
            System.out.println("toplam = " + toplam);

        }
    }

