import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        //13. İstifadəçinin daxil etdiyi aya uyğun neçə həmin ayın neçə gün olduğunu tapan proqram yazın.(switch ilə)
        Scanner scanner = new Scanner(System.in);
        System.out.println("ay daxil edin: ");

        int month = scanner.nextInt();
        int days=0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
                default:
                    days = 0;
                    break;
            }
        System.out.println(days+ " days ");

}
}
