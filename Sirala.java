import java.util.Scanner;

public class Sirala {

    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("sıralamak istediğiniz 3 sayıyı giriniz");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.println("sıralama : a<b<c");
            }
            else{
                System.out.println("sıralama : a<c<b");
            }
        }else if(b<c && b<a){
            if(c<a){
                System.out.println("sıralama : b<c<a");
            }
            else{
                System.out.println("sıralama : b<a<c");
            }

        }else if(c<a && c<b){
            if(a<b){
                System.out.println("sıralama : c<a<b");
            }
            else{
                System.out.println("sıralama : c<b<c");
            }
        }


    }
}
