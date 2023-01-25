package Strings;

public class TerseCevirme {
    public static void main(String[] args) {
        // Question 9 (interview)- Ask the user for a String and print and save the String in reverse.
        String str= "Java ogrenmek icin cok calismak lazim!";
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.substring(i,i+1);
        }
        System.out.println(ters);
    }
}
