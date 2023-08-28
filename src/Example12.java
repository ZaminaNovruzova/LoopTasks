import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        //12. N natural ədədinin rəqəmlərinin sayını tapmaq üçün proqram yazın
        Scanner scanner = new Scanner(System.in);
        int ededinReqemSayi = 0;
        System.out.println("eded daxil edin: ");
        int n = scanner.nextInt();
        while (n!= 0) {
            n /= 10;
            ++ededinReqemSayi;


        }
        System.out.println("reqem sayi: " + ededinReqemSayi);
    }
}
