package Strings;

public class cumledenSayiCekme {
    public static void main(String[] args) {
        String input="1-48 of 87 results for \"nutella\"";
        //Gittigimiz web sayfasinda aldigimiz
        // string  arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin
        int indexOfof=input.indexOf("of");//5
        int indexOfresults=input.indexOf("results");//11
        int sayi=Integer.parseInt(input.substring(indexOfof+3,indexOfresults-1));
        if(sayi>50) {
            System.out.println("50'den cok var");
        }else System.out.println("50'den az");
    }
}
