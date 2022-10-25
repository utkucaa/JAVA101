import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi,toplam=0;

        System.out.println("bir sayı giriniz:");
        sayi = input.nextInt();

        for(int i=1 ; i<sayi ; i++){
            if(sayi%i==0){
                toplam += i;
            }

        }

        if(toplam == sayi){
            System.out.println("sayı mükemmel sayıdır");
        }else{
            System.out.println("sayı mükemmel sayı değildir");
        }



    }
}
