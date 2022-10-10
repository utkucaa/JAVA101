import java.util.Scanner;
import java.lang.String;

public class kullaniciGiris{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName, password, sifirlama, newPassword;

        System.out.print("Kullanıcı Adınız: ");
        userName = scan.nextLine();
        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if(userName.equals("utkuca") && password.equals("4521")){
            System.out.print("Başarıyla Giriş Yaptınız!");
        } else if(!(userName.equals("utkuca") && password.equalsIgnoreCase("4521"))){
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H):");
            sifirlama = scan.nextLine();
            if(sifirlama.equals("u")){
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scan.nextLine();

                while(newPassword.equals("4521")||newPassword.equals(password)){
                    System.out.print("Şifreniz oluşturulamadı. Farklı bir şifre ile tekrar deneyiniz: ");
                    newPassword = scan.nextLine();
                }
                System.out.print("Şifreniz başarıyla oluşturuldu.\nYeniden giriş yapabilirsiniz.\nKullanıcı adınız: ");
                userName = scan.nextLine();
                System.out.print("Şifreniz: ");
                password = scan.nextLine();

                if(userName.equals("utkuca") && password.equals(newPassword)){
                    System.out.print("Başarıyla giriş yaptınız.");
                } else{
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
                }

            }
        }
    }
}
