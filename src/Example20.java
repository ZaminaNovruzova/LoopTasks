import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        //20. 1'dən N natural ədədinə qədər sonu 3 və ya 5 ilə bitən ədədləri çapa verən proqram yazın
        int n = 0;
        while (n < 100) {
            n++;
            if (n % 10 == 3 || n % 10 == 5) {

                System.out.println(n);

            }
        }
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 3 || i % 10 == 5) {
                System.out.println(i);
            }
        }
    }
}