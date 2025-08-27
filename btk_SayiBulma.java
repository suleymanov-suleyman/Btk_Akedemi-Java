import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class btk_SayiBulma {
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Integer> sayilar = new ArrayList<Integer>();
            System.out.print("Kaç sayı girmek istiyorsunuz: ");
            int girilecekSayiMiktari = input.nextInt();

            input.nextLine();

            System.out.println("Lütfen girmek istediğiniz sayıları giriniz: ");
            System.out.println("");
            for (int i = 0; i < girilecekSayiMiktari; i++){
                System.out.print((i + 1) + ". sayıyı giriniz: ");
                int sayi = input.nextInt();
                sayilar.add(sayi);
                System.out.println("");
            }
            input.nextLine();
            System.out.println("Girdi alma işlemi tamamlandı! ");
            System.out.print("Lütfen bulmak istediğiniz sayıyı giriniz: ");
            int arananSayi = input.nextInt();

            boolean sayiBulunduMu = false;
            for (int i:sayilar){
                if (i == arananSayi) {
                    sayiBulunduMu = true;
                    break;
                }
            }
            if (sayiBulunduMu) {
                System.out.println("-----------------------------------");
                System.out.println("Aradağınız sayı listede bulunuyor!");
                System.out.println("-----------------------------------");
            }else {
                System.out.println("-----------------------------------");
                System.out.println("Aradağınız sayı listede bulunmuyor!");
                System.out.println("-----------------------------------");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Lütfen sayı harici girdi girmeyiniz!");
        }
    }
}