import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        int birinciSayi,ikinciSayi,secim;

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz:");
        birinciSayi = input.nextInt();

        System.out.println("ikinci sayiyi giriniz:");
        ikinciSayi = input.nextInt();

        System.out.println("1-toplama 2-çıkarma 3-çarpma 4-bölme");
        System.out.println("seç:");
        secim = input.nextInt();

        if(secim == 1 ){
            System.out.println("toplama :" +(birinciSayi + ikinciSayi));
        } else if (secim == 2) {
            System.out.println("çıkarma :"+(birinciSayi - ikinciSayi));
        } else if (secim == 3) {
            System.out.println("çarpma :"+(birinciSayi * ikinciSayi));
        } else if (secim == 4) {
            System.out.println("bölme :"+(birinciSayi / ikinciSayi));
        }


    }
}
