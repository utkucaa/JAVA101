import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kacElemanli,fib=0;
        int eleman1=0;
        int eleman2=1;


        System.out.println("kaç elemanlı fibonacci serisi yazdırmak istiyorsunuz");
        kacElemanli = input.nextInt();

        System.out.print("1 ");
        for(int i=0 ; i<kacElemanli-1 ; i++ ){

            fib = eleman1 + eleman2;
            eleman1 = eleman2;
            eleman2 = fib;

            System.out.print(fib + " ");
        }

    }
}
