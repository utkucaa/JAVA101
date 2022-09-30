import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.print("fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.print("kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.print("türkçe notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.print("tarih notunuzu giriniz :");
        tarih = input.nextInt();

        System.out.print("müzik notunuzu giriniz :");
        muzik = input.nextInt();


        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc);

        String durum = sonuc>=60 ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);

    }
}
