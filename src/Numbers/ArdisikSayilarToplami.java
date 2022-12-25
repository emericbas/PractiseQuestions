package Numbers;

public class ArdisikSayilarToplami {
    public static void main(String[] args) {
        //  Soru29-)
        //  1'den 100'e kadar olan doğal sayıların toplamını bulmak için
        //  return yapan bir methotta bir Program yazın.
        System.out.println(toplam());
    }
    public static int toplam(){
        int toplam=0;
        for (int i = 1; i <=100; i++) {
            toplam+=i;
        }return toplam;
    }
}
