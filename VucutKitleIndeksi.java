import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        int kilo;
        double boy,vki;

        Scanner input = new Scanner(System.in);

        System.out.println("boyunuzu giriniz:");
        boy = input.nextDouble();

        System.out.println("kilonuzu giriniz:");
        kilo = input.nextInt();

        vki = kilo / (boy*boy);

        System.out.println("vücut kitle indeksiniz:" +vki);

    }
}
