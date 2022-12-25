package Strings;

public class StringdeSayiToplama {
    public static void main(String[] args) {
        //  Soru 34-)
        //  Bir String'i parametre olarak kabul eden ve
        //  verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
        String str = "ade1r4d3 er45kl";
        sayiToplami( str);
    }

    private static void sayiToplami(String str) {
      int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        }
        System.out.println(toplam);
    }
}
