import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogumYili;

        System.out.println("doğum yılınızı giriniz:");
        dogumYili = input.nextInt();

        if(dogumYili % 12 == 0){
            System.out.println("çin zodyağı burcunuz : maymun");
        }else if(dogumYili % 12 == 1){
            System.out.println("çin zodyağı burcunuz : horoz");
        }else if(dogumYili % 12 == 2){
            System.out.println("çin zodyağı burcunuz : köpek");
        } else if (dogumYili % 12 == 3) {
            System.out.println("çin zodyağı burcunuz : domuz");
        } else if (dogumYili % 12 == 4) {
            System.out.println("çin zodyağı burcunuz : fare");
        } else if (dogumYili % 12 == 5) {
            System.out.println("çin zodyağı burcunuz : öküz");
        } else if (dogumYili % 12 == 6) {
            System.out.println("çin zodyağı burcunuz : kaplan");
        } else if (dogumYili % 12 == 7) {
            System.out.println("çin zodyağı burcunuz : tavşan");
        } else if (dogumYili % 12 == 8) {
            System.out.println("çin zodyağı burcunuz : ejderha");
        } else if (dogumYili % 12 == 9) {
            System.out.println("çin zodyağı burcunuz : yılan");
        } else if (dogumYili % 12 == 10) {
            System.out.println("çin zodyağı burcunuz : at");
        }else if(dogumYili % 12 == 11){
            System.out.println("çin zodyağı burcunuz : koyun");
        }


    }
}
