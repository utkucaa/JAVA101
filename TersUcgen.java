import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basamakSayi;

        System.out.println("basamak sayısını giriniz:");
        basamakSayi =input.nextInt();

        for(int i=0 ; i<basamakSayi ; i++){
            for(int j=0 ; j<=i ;j++){
                System.out.println(" ");
            }
            for(int k=2*basamakSayi-1 ; k>=(2*i+1) ; k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
