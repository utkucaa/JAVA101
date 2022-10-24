import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        int ebob = 1, i = 1, j = 1;

        System.out.println("birinci sayıyı giriniz:");
        sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        sayi2 = input.nextInt();

        if (sayi1 < sayi2) {
            while (i <= sayi1) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("ebob :" + ebob);

            while (j <= (sayi1 * sayi2)) {
                if (j % sayi1 == 0 && j % sayi2 == 0) {
                    System.out.println("ekok:" + j);
                    break;
                }
                j++;
            }

        } else {
            while (i <= sayi2) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            System.out.println("ebob :" + ebob);

            while (j <= (sayi1 * sayi2)) {
                if (j % sayi1 == 0 && j % sayi2 == 0) {
                    System.out.println("ekok :" + j);
                    break;
                }
                j++;
            }

        }
    }
}