import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3. 10 ədəd qəbul edən və maksimumu çap edən proqram yazın
        System.out.println("10 eded daxil edin:");
        int max = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int eded = scanner.nextInt();
            if (i == 1) {
                max = eded;
            } else if (eded > max) {
                max = eded;
            }
        }
        System.out.println("en boyuk eded: "+max);
    }
}
