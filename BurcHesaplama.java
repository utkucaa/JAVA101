import java.util.Scanner;

public class BurcHesaplama {

    public static void main(String[] args) {

        int ay,gun;

        Scanner input = new Scanner(System.in);

        System.out.println("kaçıncı ayda doğdunuz:");
        ay = input.nextInt();

        System.out.println("hangi gün doğdunuz");
        gun = input.nextInt();

        if((ay==1 && gun<=20)||(ay==12 && gun>=21)){
            System.out.println("burcunuz oğlak");
        }else if((ay==1 && gun>=21)||(ay==2 && gun<=19)) {
            System.out.println("burcunuz kova");
        }else if((ay==2 && gun>=20)||(ay==3 && gun<=20)) {
            System.out.println("burcunuz balık");
        }else if((ay==3 && gun>=21)||(ay==4 && gun<=20)) {
            System.out.println("burcunuz koç");
        }else if((ay==4 && gun>=21)||(ay==5 && gun<=20)) {
            System.out.println("burcunuz boğa");
        }else if((ay==5 && gun>=21)||(ay==6 && gun<=21)) {
            System.out.println("burcunuz ikizler");
        }else if((ay==6 && gun>=22)||(ay==7 && gun<=22)) {
            System.out.println("burcunuz yengeç");
        }else if((ay==7 && gun>=23)||(ay==8 && gun<=23)) {
            System.out.println("burcunuz aslan");
        }else if((ay==8 && gun>=24)||(ay==9 && gun<=23)) {
            System.out.println("burcunuz başak");
        }else if((ay==9 && gun>=24)||(ay==10 && gun<=23)) {
            System.out.println("burcunuz terazi");
        }else if((ay==10 && gun>=24)||(ay==11 && gun<=22)) {
            System.out.println("burcunuz akrep");
        }else if((ay==11 && gun>=23)||(ay==12 && gun<=21)) {
            System.out.println("burcunuz yay");
        }

    }
}
