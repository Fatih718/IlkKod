public class Main {
    public static void main(String[] args) {
        long toplam = 0;

        System.out.println("1 ile 20 arasindaki cift sayilar ve kupleri:");
        System.out.println("-------------------------------------------");

        for (int i = 2; i <= 20; i += 2) {
            long kup = (long) i * i * i;
            toplam += kup;
            System.out.println(i + "^3 = " + kup);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Cift sayilarin kupleri toplami: " + toplam);
    }
}
