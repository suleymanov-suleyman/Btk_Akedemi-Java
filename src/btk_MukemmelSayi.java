import java.util.InputMismatchException;
import java.util.Scanner;

public class btk_MukemmelSayi {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Lütfen bir sayı giriniz: ");
            int sayi = input.nextInt();
            if (sayi < 0) {
                System.out.println("Lütfen sadece pozitif sayı giriniz!");
                return;
            }
            if (sayi == 0) {
                System.out.println("0 mükemmel sayı değildir!");
                return;
            }
            int toplam = 0;
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.println("Girdiğiniz sayı mükemmel sayıdır!");
            }
            else {
                System.out.println("Girdiğiniz sayı mükemmel sayı değildir!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lütfen sadece sayı giriniz!");
        }
    }
}