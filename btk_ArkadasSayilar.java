import java.util.InputMismatchException;
import java.util.Scanner;

public class btk_ArkadasSayilar {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {

            System.out.print("Lütfen ilk sayıyı giriniz: ");
            int sayi1 = input.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            int sayi2 = input.nextInt();
            int toplam1 = 0;
            int toplam2 = 0;

            for (int i = 1; i < sayi1; i++) {
                if (sayi1 % i == 0) {
                    toplam1 += i;
                }
            }
            if (toplam1 != sayi2) {
                System.out.println("Girdiğiniz sayılar arkadaş sayılar değildir! ");
                return;
            }
            for (int i = 1; i < sayi2; i++) {
                if (sayi2 % i == 0) {
                    toplam2 += i;
                }
            }
            if (toplam2 == sayi1) {
                System.out.println("Girdiğiniz sayılar arkadaş sayılardır! ");
            }else {
                System.out.println("Girdiğiniz sayılar arkadaş sayılar değildir! ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Lütfen sadece sayı giriniz");
        }
    }
}