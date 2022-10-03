import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double kg,tutar1,tutar2,tutar3,tutar4,tutar5,toplamtutar;

        Scanner input = new Scanner(System.in);

        System.out.println("kaç kilo armut aldınız :");
        kg = input.nextDouble();
        tutar1 = armut * kg;

        System.out.println("kaç kilo elma aldınız :");
        kg = input.nextDouble();
        tutar2 = elma * kg;

        System.out.println("kaç kilo domates aldınız :");
        kg = input.nextDouble();
        tutar3 = domates * kg;

        System.out.println("kaç kilo muz aldınız :");
        kg = input.nextDouble();
        tutar4 = muz * kg;

        System.out.println("kaç kilo patlıcan aldınız :");
        kg = input.nextDouble();
        tutar5 = patlican * kg;


        toplamtutar = tutar1 + tutar2 + tutar3 + tutar4 + tutar5;

        System.out.println("toplam tutarınız :" +toplamtutar);
        

    }
}

