import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
       // 2. 10 ədəd qəbul edən və maksimum tək ədədi çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.println("10 eded daxil edin:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ "eded daxil edin");
            int eded = scanner.nextInt();
            if (i == 1 && eded%2==1&&eded!=0) {
                max = eded;
            } else if (eded > max && eded%2==1&&eded!=0) {
                max = eded;
            }
        }
        System.out.println("en boyuk tek eded " + max);
    }
}
