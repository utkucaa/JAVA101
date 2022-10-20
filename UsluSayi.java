import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi,us,carp = 1;


        System.out.println("üssü alınacak sayı:");
        sayi = input.nextInt();

        System.out.println("üs olacak sayıyı giriniz:");
        us = input.nextInt();

        for(int i=1 ; i<=us ; i++){
            carp *= sayi;

            if(i<us){
                continue;
            }else{
                System.out.println("cevap:"+carp);
            }

        }



    }
}
