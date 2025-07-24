import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class btk_SayiBulma {
    public static void Main (String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Integer> sayilar = new ArrayList<Integer>();
            System.out.print("Kaç sayı girmek istiyorsunuz: ");
            int girilecekSayiMiktari = input.nextInt();

            input.nextLine();

            System.out.print("Lütfen girmek istediğiniz sayıları giriniz: ");
            for (int i = 0; i < girilecekSayiMiktari; i++){
                System.out.println((i + 1) + ". sayıyı giriniz");
                int sayi = input.nextInt();
                sayilar.add(sayi);
            }
            input.nextLine();
            System.out.println("Girdi alma işlemi tamamlandı! ");
            System.out.print("Lütfen bulmak istediğiniz sayıyı giriniz: ");
            int arananSayi = input.nextInt();

            for (int i:sayilar){
                if (i == arananSayi) {
                    System.out.println("Aradağınız sayı listede bulunuyor!");
                }else {
                    System.out.println("Aradağınız sayı listede bulunmuyor!");
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Lütfen sayı harici girdi girmeyiniz!");
        }
    }
}