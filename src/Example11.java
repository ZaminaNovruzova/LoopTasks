import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        //11.N natural ədədinin rəqəmlərinin cəmini tapmaq üçün proqram yazın
        Scanner scanner = new Scanner(System.in);
        int ededinReqemlerininCemi = 0;
        int qaliq = 0;
        System.out.println("eded daxil edin: ");
        int n = scanner.nextInt();
        while (n!= 0) {
            qaliq=n%10;
            ededinReqemlerininCemi=ededinReqemlerininCemi+qaliq;
            n=n/10;




        }
        System.out.println("netice: " + ededinReqemlerininCemi);
    }
}
