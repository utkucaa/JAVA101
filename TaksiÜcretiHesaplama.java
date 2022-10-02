import java.util.Scanner;

public class TaksiÜcretiHesaplama {

    public static void main(String[] args) {

        int km;
        double kmbasi = 2.20 , toplam , baslangicTutar = 10 ;

        Scanner input = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden giriniz :");
        km = input.nextInt();

        toplam = (km + kmbasi);
        toplam += baslangicTutar;

        toplam = (toplam < 20) ? 20 : toplam;
        System.out.println("toplam tutar : " +toplam);


    }

}
