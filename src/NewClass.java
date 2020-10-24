
import java.util.Random;
import java.util.Scanner;

public class NewClass {

    public static String sifre_elemanları[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static Random rnd = new Random();

    public static String sifre_olusturucu(int parola_length) {
        String sifre = "";
        for (int i = 0; i < parola_length; i++) {
            int rastgele_parola = rnd.nextInt(sifre_elemanları.length);
            sifre += rastgele_parola;
        }
        return sifre;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int parola_length = 0;
        System.out.print("Şifreniz kaç karakterli . \n(Min: 4 Max: 12) : ");
        parola_length = scan.nextInt();

        while (parola_length < 4 || parola_length > 12) {

            System.out.print("Şifreniz kaç karakterli . \n(Min: 4 Max: 12) : ");
            parola_length = scan.nextInt();

        }
        String sifre = "";
        String sahte_sifre = "";
        int adım = 0;
        sifre = sifre_olusturucu(parola_length);
        System.out.println("Şifre: " + sifre);
        while (!sifre.equals(sahte_sifre)) {
            sahte_sifre = sifre_olusturucu(parola_length);
            System.out.println("Şifre: " + sifre + " Sistemin denediği şifre: " + sahte_sifre);

            if (sifre.equals(sahte_sifre)) {

                break;
            }
            adım++;
            sahte_sifre = "";
        }
        System.out.println("Sistemin bulduğu sifre: " + sahte_sifre);
        System.out.println(adım + " adımda şifreyi çözdü...");

    }
}
