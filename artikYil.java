import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yil;

        System.out.println("yıl giriniz:");
        yil = input.nextInt();

        if (yil % 4 == 0) {

            if( yil % 100 == 0){

                if(yil % 400 == 0){

                    System.out.println("girdiğiniz yıl artık yıldır");
                }else{

                    System.out.println("girdiğiniz yıl artık yıl değildir");
                }
            }else{
                System.out.println("girdiğiniz yıl artık yıldır");
            }
        }else{
            System.out.println("girdiğiniz yıl artık yıl değildir");
        }

    }
}
