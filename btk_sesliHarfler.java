import java.util.Scanner;

public class btk_sesliHarfler {
    public static void main(String[] args) {
        System.out.print("lutfen bir harf giriniz: ");
        Scanner input = new Scanner(System.in);
        try {
            String girdi = input.next();
            if (girdi.isEmpty()){
                System.out.println("girdi bos birakilamaz");
                return;
            }
            if (girdi.length() != 1) {
                System.out.println("sadece 1 harf girebilirsiniz!");
                return;
            }
            char karakter = girdi.charAt(0);
            if (!Character.isLetter(karakter)){
                System.out.println("sadece harf girebilirsiniz!");
                return;
            }
            String kalinHarfler = "aıouAIOU";
            String inceHarfler = "eiöüEİÖÜ";

            if (kalinHarfler.contains(String.valueOf(karakter))) {
                System.out.println("girdiginiz harf kalin harftir");
            }else if (inceHarfler.contains(String.valueOf(karakter))) {
                System.out.println("girdiginiz harf ince harftir");
            }else {
                System.out.println("girdiginiz harf sessiz harftir");
            }
        }catch(Exception e) {
            System.out.println("Beklenmedik bir hata olustu!" + e.getMessage());
        }finally {
            input.close();
        }
    }
}