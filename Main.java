public class Main {
    public static void main(String[] args) {

        System.out.println("=== Syarat 3: dua konstruktor (overload) ===");
        Mobil mobil1 = new Mobil("Nissan GT-R R34", "MOB-001", 2);      // bensin penuh
        Mobil mobil2 = new Mobil("Porsche", "MOB-002", 1, 3);           // bensin awal 3
        Motor motor = new Motor("Yamaha Mio GT 115", "MTR-001", "matic");
        Truk truk = new Truk("Truk Box", "TRK-001", 3000);
        mobil1.info();
        mobil2.info();

        System.out.println();
        System.out.println("=== Syarat 1: method void dan method return ===");
        mobil1.jalankan(100);                                  // mengubah state
        System.out.println("Bensin cukup untuk 30 liter? " + mobil1.cukupBensin(30));   // return value
        mobil1.isiBensin(5);                                   // method void

        System.out.println();
        System.out.println("=== Syarat 2: konstanta dan atribut final ===");
        System.out.println("Batas bensin (public static final): " + Kendaraan.BATAS_BENSIN + " liter");
        System.out.println("Nomor kendaraan (private final): " + mobil1.getNomorKendaraan());
        // mobil1.setNomorKendaraan("X");  // tidak bisa, setter memang tidak ada

        System.out.println();
        System.out.println("=== Syarat 4, 5, 6, 7: inheritance, super, override, abstract ===");
        // new Kendaraan(...) tidak bisa, karena Kendaraan abstract
        mobil1.info();
        mobil1.jalankan(50);
        motor.info();
        motor.jalankan(80);
        truk.info();
        truk.jalankan(50);

        System.out.println();
        System.out.println("=== Syarat 8: if/else membaca dan mengubah state ===");
        mobil2.jalankan(100);    // bensin cuma 3, butuh 10 -> masuk else
        mobil2.isiPenuh();       // diisi sampai penuh
        mobil2.jalankan(100);    // sekarang cukup -> masuk if

        System.out.println();
        System.out.println("=== Syarat 9: variabel bertipe interface ===");
        BisaServis s = new Motor("Motor Baru", "MTR-002", "sport");
        s.servis();
        BisaIsiBahanBakar b = new Truk("Truk Baru", "TRK-002", 1000);
        b.isiPenuh();

        System.out.println();
        System.out.println("=== Syarat 10: satu class dua interface (Mobil) ===");
        BisaServis a = mobil1;
        BisaIsiBahanBakar c = mobil1;
        a.servis();
        c.isiPenuh();
    }
}
