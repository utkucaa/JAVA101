import java.util.Scanner;

public class MinMaxBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kac,sayi,max=0,min=0;

        System.out.println("kaç tane sayı gireceksin:");
        kac = input.nextInt();

        for(int i=1 ;i<=kac ; i++){
            System.out.println( i+ ".sayiyi giriniz:");
            sayi = input.nextInt();

            if(i==1){
                max = sayi;
                min = sayi;
            }

            if(sayi>max){
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }

        }

        System.out.println("girilen sayılardan en büyüğü:"+max);
        System.out.println("girilen sayılardan en küçüğü:"+min);

    }
}
