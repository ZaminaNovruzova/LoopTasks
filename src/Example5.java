public class Example5 {
    public static void main(String[] args) {
        //5. 1-dən 100-ə qədər 3-ə və 2-yə bölünə bilən bütün ədədləri çap edən proqram yazın
        System.out.println("1 den 100e qeder eded 2 ve 3 e bolunen ededler:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println (i);
            }
        }
    }
}
