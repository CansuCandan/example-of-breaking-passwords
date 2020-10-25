
import java.util.Random;
import java.util.Scanner;

public class NewClass {

    public static Random rnd = new Random();

    // This function for creating random password
    public static String password_creator(int parola_length) {
        String password = "";
        for (int i = 0; i < parola_length; i++) {
            int rastgele_parola = rnd.nextInt(10);
            password += rastgele_parola;
        }
        return password;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int parola_length = 0;
        System.out.print("Şifreniz kaç karakterli . \n(Min: 4 Max: 12) : ");
        parola_length = scan.nextInt();

        // if user entered invalid character
        while (parola_length < 4 || parola_length > 12) {

            System.out.print("Şifreniz kaç karakterli . \n(Min: 4 Max: 12) : ");
            parola_length = scan.nextInt();

        }

        String password = "";
        String fake_password = "";
        int step = 0;

        password = password_creator(parola_length);
        System.out.println("Şifre: " + password);
        
        // it is trying to find the password here
        while (!password.equals(fake_password)) {
            fake_password = password_creator(parola_length);
            System.out.println("Şifre: " + password + " Sistemin denediği şifre: " + fake_password);
             
            if (password.equals(fake_password)) {

                break;
            }
            step++;
            fake_password = "";
        }
        System.out.println("Sistemin bulduğu sifre: " + fake_password);
        System.out.println(step + " adımda şifreyi çözdü...");

    }
}

