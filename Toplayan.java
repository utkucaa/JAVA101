//tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayan prog.

import java.util.Scanner;

public class Toplayan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi,toplam=0;

        do {

            System.out.println("sayı giriniz:");
            sayi = input.nextInt();

            if(sayi % 4 == 0){
                toplam = toplam + sayi;
            }


        }while(sayi % 2 == 0);


        System.out.println("toplam : " + toplam);

    }
}
