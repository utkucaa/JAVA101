import java.util.Scanner;

public class DortVeBesKuvvetler {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi,sayac=1,i=1;

        System.out.println("sayı giriniz:");
        sayi = inp.nextInt();

        while(sayac<=sayi){
            System.out.println("dört üssü :" +sayac);
            sayac *= 4;

            if(i<=sayi){
                System.out.println("beş üssü:--------" +i);
                i*=5;
            }

        }

    }
}
