import java.util.Scanner;

public class Example1 {
    //1. 10 ədəd qəbul edən və minimum cüt ədədi çap edən proqram yazın
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        System.out.println("10 eded daxil edin:");
        for (int i = 1; i <= 10; i++)
        // dovr 10 defe getsin deye yazilib
        {
            System.out.println(i + "ci ededi daxil edin:");
            int eded = input.nextInt();
            if (i == 1 && eded % 2 == 0 && eded != 0) {
                min = eded;
            } else if (eded < min && eded % 2 == 0 && eded != 0) {
                min = eded;
            }
        }

        System.out.println("en kicik cut eded:" + min);
    }

}


