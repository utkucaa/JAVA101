import java.util.Scanner;

public class sinifiGecme {

    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuz:");
        mat = input.nextInt();

        System.out.println("türkçe notunuz:");
        turkce = input.nextInt();

        System.out.println("fizik notunuz:");
        fizik = input.nextInt();

        System.out.println("kimya notunuz:");
        kimya = input.nextInt();

        System.out.println("muzik notunuz:");
        muzik = input.nextInt();

        double ort = (mat + fizik + turkce + kimya + muzik) / 5;

        if(ort <= 55){
            System.out.println("sınıfta kaldınız");
            
        }
        else{
            System.out.println("tebrikler sınıfı geçtiniz");
        }

        System.out.println("ortalamanız :" +ort);

    }
}
