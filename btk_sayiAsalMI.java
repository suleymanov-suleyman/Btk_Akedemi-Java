import java.util.InputMismatchException;
import java.util.Scanner;

public class btk_sayiAsalMI {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("lutfen bir sayi giriniz: ");
        try {
            int sayi = input.nextInt();
            boolean asalMi = true;
            if (sayi < 2) {
                System.out.println("lutfen 2 ustu gecerli bir sayi giriniz!");
            } else {
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        asalMi = false;
                        break;
                    } else {
                        continue;
                    }
                }

                if (asalMi) {
                    System.out.println("sayi asal");
                } else {
                    System.out.println("sayi asal degil");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("lutfen sayi giriniz");
        }
        finally{
            input.close();
        }
    }
}