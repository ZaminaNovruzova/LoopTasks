import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        //14. İstifadəçinin daxil etdiyi fəsilə uyğun həmin fəslin aylarını tapan proqram yazın.(switch ilə)
        Scanner season = new Scanner(System.in);
        System.out.println("fesil daxil edin: ");
        String fesil = season.next();
        switch (fesil) {
           case "yaz" :
                System.out.println("mart,aprel,may");
            break;
            case "yay":
            System.out.println("iyun,iyul,avqust");
            break;
            case "payiz":
            System.out.println("sentyabr,oktyabr,noyabr");
            break;
            case "qis":
            System.out.println("dekabr,yanvar,fevral");
            break;
            default:
                System.out.println("error");
        }


    }
}
