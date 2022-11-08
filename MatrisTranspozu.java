import java.util.Scanner;

public class MatrisTranspozu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int satir,sütun;

        System.out.print("matris kaç satırlı?");
        satir = input.nextInt();

        System.out.println("matris kaç sütunlu?");
        sütun = input.nextInt();

        System.out.println("matrisin elemanlarına sırasıyla giriniz:");

        int[][] matris = new int[satir][sütun];

        for(int i=0 ; i<matris.length ; i++){
            for(int j=0 ; j<matris[i].length ; j++){
                matris[i][j] = input.nextInt();
            }

            System.out.print("matris:");
            System.out.println();
        }
        System.out.println("-----------");

        System.out.println("matrisin transpozu : ");
        System.out.println();


        for(int j=0 ; j<matris[0].length ; j++){
            for(int i=0 ; i<matris.length ; i++){
                System.out.print(matris[i][j]+"  ");
            }
            System.out.println();
        }

        input.close();;


    }
}

