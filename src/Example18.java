import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        //18. İstifadəçinin daxil etdiyi ədədlərin cüt və tək olanların sayını tapan proqram yazın
        Scanner scanner = new Scanner(System.in);
        int cutEdedSayi = 0;
        int tekEdedSayi = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "ci ededi daxil edin: ");
            int eded = scanner.nextInt();
            if (eded % 2 == 0 && eded != 0) {
                cutEdedSayi++;
            } else if (eded % 2 != 0 && eded != 0) {
             tekEdedSayi++;
            }
        }
        System.out.println("cut ededlerin sayi: " + cutEdedSayi);
        System.out.println("tek ededlerin sayi: " + tekEdedSayi);
    }
}
