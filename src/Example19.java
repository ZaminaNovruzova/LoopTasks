import java.util.Scanner;

public class Example19 {
    public static void main(String[] args) {
        //19. Ədədin tərsini tapan proqram yazın

        Scanner scanner = new Scanner(System.in);
        int qaliq = 0;
        int ededinTersi = 0;
        System.out.println("eded: ");
        int n = scanner.nextInt();
        while (n > 0) {
            qaliq = n % 10;
            ededinTersi = ededinTersi * 10 + qaliq;
            n /= 10;

        }
        System.out.println("ededinTersi " + ededinTersi);
    }
}
