import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        int nfak = 1;
        int rfak = 1;
        int nrfak = 1;
        int kombinasyon = 0;

        // Kullanıcıdan giriş bekleniyor

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı giriniz (n): ");
        n = input.nextInt();
        System.out.print("Seçim Sayısı (r): ");
        r = input.nextInt();

        // Her döngüde ihtiyacımız olan faktöryelli değerler bulunur.
        for (int i = 1; i <= n; i++) {
            nfak *= i;
        }
        System.out.println("n Faktöriyel: " + nfak);

        for (int i = 1; i <= r; i++) {
            rfak *= i;

        }
        System.out.println("r Faktöriyel: " + rfak);
        for (int i = 1; i <= (n - r); i++) {
            nrfak *= i;

        }
        System.out.println("(n - r) Faktöriyel: " + nrfak);

        //Kombinasyon formülünde bulunan değerler işlenerek sonuç yazdırılır.
        kombinasyon = nfak / (rfak * nrfak);

        System.out.print("Kombinasyon: " + kombinasyon);
    }
}
