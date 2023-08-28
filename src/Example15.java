import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
//         1'dən N natural ədədinə qədər ədədlər arasında boşluq qoymaqla ekrana yazan proqram yazın.++
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i);
            System.out.println(" ");

        }
    }
}
