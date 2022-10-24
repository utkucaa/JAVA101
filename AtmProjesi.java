import java.util.Scanner;

public class AtmProjesi {

    public static void main(String[] args) {

        String userName,password;
        Scanner input = new Scanner(System.in);

        int right=3;
        int bakiye=5000;
        int secim;

        while(right > 0){

            System.out.println("kullanıcı adınız:");
            userName = input.nextLine();
            System.out.println("parolanız:");
            password = input.nextLine();

            if(userName.equals("utkucaa") && password.equals("1234")){
                System.out.println("sisteme giriş yaptınız");

                do{
                    System.out.println("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgulama\n" +
                            "4-çıkış yap");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz.");
                    secim = input.nextInt();
                    if(secim == 1){
                        System.out.println("para miktarı:");
                        int para = input.nextInt();
                        bakiye += para;
                    }else if(secim ==2){
                        System.out.println("para miktarı:");
                        int para = input.nextInt();
                        if(para > bakiye){
                            System.out.println("bakiye yetersiz");
                        }else {
                            bakiye -= para;
                        }
                    }else if(secim == 3){
                            System.out.println("bakiyeniz:" +bakiye);
                        }

                }while(secim != 4);
                break;
            }else{
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre.tekrar deneyiniz");
                if(right == 0){
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                }else{
                    System.out.println("kalan hakkınız:"+right);

                }

            }
        }

    }
}
