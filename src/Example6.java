import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        //6. İstifadəçidən 10 ədədi qəbul edən və onların cəmini çap edən proqram yazın
        Scanner scanner = new Scanner(System.in);
        int cem = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " eded daxil edin:");
            int x = scanner.nextInt();
            cem+=x;
        }
        System.out.println("toplam: "+cem);
    }
}