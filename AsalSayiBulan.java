import java.util.Scanner;

public class AsalSayiBulan {

    public static void main(String[] args) {

        int sayac = 0,kontrol=0;

        for(int sayi=2;sayi<=100;sayi++)
        {
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }


    }
}
