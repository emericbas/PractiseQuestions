package Numbers;

public class MukemmelSayi {
    public static void main(String[] args) {
        // Sayının Mükemmel sayı olup olmadığını return eden bir metod yazalım.
        // NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse
        // bu tür sayılar Mükemmel Sayı olabilir.
        int sayi=6;
        mukemmelSayi(sayi);
    }
    public static void mukemmelSayi(int sayi){
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0) {
                toplam += i;
            } }
        if(toplam==sayi){
                    System.out.println("Mukemmel sayi");

                }else System.out.println("Mukemmel sayi degil");
            }
        }



