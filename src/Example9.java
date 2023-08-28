import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        //İstifadəçidən 10 ədəd qəbul edən və 10-dan böyük və 30-dan kiçik olan bütün ədədlərin cəmini çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int cem = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int x = scanner.nextInt();
            if (x > 10 && x < 30) {
                cem += x;
            }
        }
        System.out.println("toplam: " + cem);

    }
}
