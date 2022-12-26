package EasyQuestions;

public class ReverseString {
    public static void main(String[] args) {
      //  Write a method that reverses a string.
   // For example, 'java interview' becomes 'weivretni avaj'.
        String str="Hayata bakis acini degistir.!";
        System.out.println(reverse(str));
    }public static String reverse(String str){
        String ters="";
        for (int i = str.length(); i >0 ; i--) {
            ters+=str.substring(i-1,i);
        }return ters;
    }
}
