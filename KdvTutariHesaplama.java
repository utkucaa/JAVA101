import java.util.Scanner;

public class KdvTutariHesaplama {

    public static void main(String[] args) {

      double tutar,kdvOran = 0.18;

      Scanner input = new Scanner(System.in);
      System.out.println("ücret tutarını giriniz:");
      tutar = input.nextDouble();

      double kdvTutar = tutar * kdvOran;
      double kdvliTutar = tutar + kdvTutar;

      System.out.println("KDV'siz Tutar :" + tutar);
      System.out.println("KDV Oranı :" + kdvOran);
      System.out.println("KDV Tutarı :" + kdvTutar);
      System.out.println("KDV'li Tutarı :" + kdvliTutar);


    }
}

