import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== MENU BENTUK ===");
            System.out.println("1. Buat Bentuk");
            System.out.println("2. Buat Bujursangkar");
            System.out.println("3. Buat Lingkaran");
            System.out.println("4. Buat Silinder");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.print("Warna: ");
                String warna = input.next();
                new Bentuk(warna).printInfo();
            } else if (menu == 2) {
                System.out.print("Sisi: ");
                double sisi = input.nextDouble();
                System.out.print("Warna: ");
                String warna = input.next();
                new BujurSangkar(sisi, warna).printInfo();
            } else if (menu == 3) {
                System.out.print("Radius: ");
                double r = input.nextDouble();
                System.out.print("Warna: ");
                String warna = input.next();
                new Lingkaran(r, warna).printInfo();
            } else if (menu == 4) {
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                System.out.print("Radius: ");
                double r = input.nextDouble();
                System.out.print("Warna: ");
                String warna = input.next();
                new Silinder(t, r, warna).printInfo();
            } else if (menu != 0) {
                System.out.println("Menu tidak ada.");
            }
        } while (menu != 0);

        System.out.println("Terima kasih!");
        input.close();
    }
}
