import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        //10. İstifadəçidən 10 ədəd qəbul edən və 10-dan böyük, 30-dan kiçik və cüt olan bütün ədədlərin cəmini çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int cutEdedlerinCemi = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int x = scanner.nextInt();
            if (x > 10 && x < 30 && x % 2 == 0) {
                cutEdedlerinCemi += x;
            }
        }
        System.out.println("toplam: " + cutEdedlerinCemi);
    }
}
