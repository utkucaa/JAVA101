import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,r,kombinasyon,carp=1,carp2=1,carp3=1;

        System.out.println("n değeri giriniz:");
        n = input.nextInt();

        System.out.println("r değeri giriniz:");
        r =input.nextInt();

        while(true){

            if(n<r){
                System.out.println("n>r olması gerekiyor tekrar deneyiniz");
                break;
            }

            for(int i=1 ; i<=n ; i++){
                carp = carp * i;
            }

            for(int j=1 ; j<=r ; j++){
                carp2 = carp2 * j;
            }

            for(int k=1 ; k<=(n-r) ; k++) {
                carp3 = carp3 * k;
            }

            kombinasyon = carp / (carp2 * carp3);

            System.out.println("sonuç:"+kombinasyon);

            break;
        }

    }
}
