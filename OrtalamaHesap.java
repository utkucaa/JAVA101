import java.util.Scanner;

public class OrtalamaHesap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, sayac = 0;
        double  ortalama ;

        System.out.println("bir sayi giriniz:");
        sayi = input.nextInt();

        for (int i = 1 ; i <= sayi; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam = toplam + i;
                sayac++;
            }


        }

        ortalama = (toplam / sayac);

        System.out.println("girdiğiniz sayıya kadar olan sayılardan 3 ve 4 e tam bölünen sayıların ortalaması : " + ortalama);


    }
}

