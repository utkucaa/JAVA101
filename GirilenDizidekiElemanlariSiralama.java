import java.util.Scanner;
import java.util.Arrays;

public class GirilenDizidekiElemanlariSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size,temp=0;

        System.out.print("dizinin boyutunu giriniz: ");
        size = input.nextInt();

        int[] list = new int[size];

        for(int i=0 ; i<size ; i++){
            System.out.print(i+1 +" .elemanı giriniz: ");
            list[i] = input.nextInt();
        }

        System.out.println("sıralanmamış dizi :"+Arrays.toString(list));

        for(int i=0 ; i<size ; i++){
            for(int j=i+1 ; j<size ; j++){

                if(list[i] > list[j]){

                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                }

            }
        }

        System.out.println("sıralanmış dizi:"+Arrays.toString(list));

    }
}
