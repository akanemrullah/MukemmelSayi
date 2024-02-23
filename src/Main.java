import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner kavrami projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Gerekli degiskenler tanimlandi.
        int number = 0, total = 0;

        // Kullanicidan kontrol edilecek olan sayi istenip ilgili degiskene atandi.
        System.out.print("Mukemmel sayi olup olmadigini kontrol etmek istedigin sayiyi gir:");
        number = input.nextInt();

        // For dongusu yardimiyla kontrol edilecek olan sayinin carpanlari toplami hesaplandi.
        for (int i = 1; i <= number - 1; i++) {

            if (number % i == 0){
                total += i;
            }
        }

        // Carpanlar toplaminin sayinin kendisi ile esit olup olmama durumu kontrol edildi.
        if (number == total){
            System.out.println(number + " sayisi mukemmel sayidir.");
        }else{
            System.out.println(number + " sayisi mukemmel sayi degildir.");
        }
    }
}