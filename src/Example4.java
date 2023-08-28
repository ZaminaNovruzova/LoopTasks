import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //4. 10 ədəd qəbul edən və minimumu çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        System.out.println("10 eded daxil edin:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int eded = scanner.nextInt();
            if (i == 1) {
                min = eded;
            } else if (eded < min) {
                min = eded;
            }
        }
        System.out.println("en kicik eded "+min);
    }
}