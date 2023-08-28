import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        //8. 10 ədədi qəbul edən və 20-dən kiçik olan bütün ədədlərin cəmini çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int cem = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int x = scanner.nextInt();
            if (x < 20) {
                cem += x;
            }
        }
        System.out.println("toplam: " + cem);
    }
}
