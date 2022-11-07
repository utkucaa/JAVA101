import java.util.Scanner;

public class DizidekiMaxMinBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int girilenSayi;

        System.out.println("bir sayı giriniz:");
        girilenSayi = input.nextInt();

        int list[] = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        for(int i : list){

            if(girilenSayi<min){
                min = i;
            }
            if(girilenSayi>max){
                max = i;
            }
        }


        System.out.println("girilen sayı : " +girilenSayi);
        System.out.println("girilen sayıdan küçük en yakın sayı : " +min);
        System.out.println("girilen sayıdan büyük en yakın sayı : " +max);

    }
}
