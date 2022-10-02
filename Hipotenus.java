import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner girdi = new Scanner(System.in);

        System.out.println("1.kenarı giriniz:");
        a = girdi.nextInt();
        System.out.println("2.kenarı giriniz:");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("hipotenüs :" + c);


    }
}
