package EasyQuestions;

public class SumMultiplesOfThreeAndFive {
    public static void main(String[] args) {
        //  Given a number n,
        //  write a method that sums all multiples of three and five up to n (inclusive).

        int n=15;
        System.out.println(sumOfNumbeers(n));
    }public static int sumOfNumbeers(int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            if(i%15==0 ){
                sum+=i;
            }else if(i%5==0 && i%15!=0){
                sum+=i;
            }else if (i%3==0 && i%15!=0){
                sum+=i;
            }
        }return sum;
    }
}