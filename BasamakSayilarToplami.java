import java.util.Scanner;

public class BasamakSayilarToplami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi,basamakToplam=0,deger;

        System.out.println("bir sayi giriniz:");
        sayi = input.nextInt();

        while(sayi!=0){

            deger = sayi % 10;
            sayi = sayi/10;
            basamakToplam += deger;


        }

        System.out.println(basamakToplam);


    }
}
