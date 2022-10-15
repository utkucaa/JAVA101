/*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

import java.util.Scanner;

public class UcakBiletFiyat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yolculukTipi;
        double mesafe,yas,indirim,odenecek;

        System.out.println("mesafeyi km cinsinden giriniz:");
        mesafe = input.nextInt();

        System.out.println("yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("tek yön ----> 1  gidiş-dönüş ----> 2 yolculuk tipinizi giriniz:");
        yolculukTipi = input.nextInt();

        odenecek = mesafe * 0.1;


        if(mesafe > 0 && yas > 0){

            if(yas<12){
                indirim = 0.5;
            }else if(yas>12 && yas<24){
                indirim = 0.1;
            }else if(yas>65){
                indirim = 0.3;
            }else{
                indirim = 0;
            }

            odenecek = odenecek * (1 - indirim);


            switch (yolculukTipi){
                case 1:
                   break;
                case 2:
                    indirim = 0.2;
                    odenecek = odenecek * 2 * (1-indirim);
                    break;
                default:
                    System.out.println("hatalı giriş");
            }
            System.out.println("toplam tutar = " +odenecek);
        }
        else{
            System.out.println("hatalı giriş");
        }


    }
}
