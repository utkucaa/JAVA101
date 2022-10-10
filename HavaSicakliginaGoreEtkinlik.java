import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {

    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("sıcaklık giriniz:");
        sicaklik = input.nextInt();

        if(sicaklik < 5){
            System.out.println("kayak yapabilirsiniz");
        }
        else if(5 <= sicaklik && sicaklik < 15){
            System.out.println("sinemaya gidebilirsiniz");
        }
        else if(15 <= sicaklik && sicaklik < 25){
            System.out.println("piknik yapabilirsiniz");
        }
        else if(sicaklik > 25){
            System.out.println("yüzmeye gidebilirsiniz");
        }

    }

}
