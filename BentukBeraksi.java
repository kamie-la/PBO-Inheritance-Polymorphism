public class BentukBeraksi {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("Kuning");
        BujurSangkar bs = new BujurSangkar(5, "Merah");
        Lingkaran l = new Lingkaran(7, "Biru");
        Silinder s = new Silinder(10, 7, "Hijau");

        b.printInfo();
        bs.printInfo();
        l.printInfo();
        s.printInfo();

        // ubah nilai lewat setter
        bs.setSisi(8);
        s.setTinggi(20);
        System.out.println("\nSetelah diubah (sisi = 8, tinggi silinder = 20):");
        bs.printInfo();
        s.printInfo();

        // polymorphism: satu array bertipe Bentuk, isinya macam-macam
        System.out.println("\n--- lewat array Bentuk[] ---");
        Bentuk[] daftar = {b, bs, l, s};
        for (Bentuk x : daftar) {
            x.printInfo(); // yang dipanggil printInfo() milik objek aslinya
        }
    }
}
